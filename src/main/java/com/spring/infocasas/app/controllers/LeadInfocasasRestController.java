package com.spring.infocasas.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.infocasas.app.configuration.InfocasasConfiguration;
import com.spring.infocasas.app.models.Infocasas;
import com.spring.infocasas.app.services.ILeadServiceInfocasas;
import com.zoho.crm.library.exception.ZCRMException;

@RestController
@RequestMapping("/api-infocasas")
public class LeadInfocasasRestController {
	
	private Logger log = LoggerFactory.getLogger(LeadInfocasasRestController.class);

	@Autowired
	private InfocasasConfiguration infocasasConfiguration;
	
	@Autowired
	private ILeadServiceInfocasas leadServiceInfocasas;
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregarLeads(@RequestBody Infocasas infocasas){
		log.info(infocasas.toString());
		infocasasConfiguration.configurationZoho();
		Map<String,Object> response = new HashMap<>();
		try {
			response = leadServiceInfocasas.createNewLead(infocasas);
		} catch (ZCRMException e) {
			response.put("ok", false);
			response.put("message", e.getMessage());
			return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("ok", true);
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
}
