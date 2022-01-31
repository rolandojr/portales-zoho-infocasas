package com.spring.infocasas.app.repositories;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.spring.infocasas.app.models.Infocasas;
import com.zoho.crm.library.api.response.APIResponse;
import com.zoho.crm.library.common.CommonUtil;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.exception.ZCRMException;

@Repository
public class LeadRepositoryInfocasasImpl implements ILeadRepositoryInfocasas {

	private Logger log = LoggerFactory.getLogger(LeadRepositoryInfocasasImpl.class);
	
	@Override
	public Map<String, Object> createNewLead(Infocasas infocasas) throws ZCRMException {
		
		Gson formatJSON = new Gson();
		
		Map<String, Object> registro = new HashMap<>();
		ZCRMRecord record = new ZCRMRecord("Leads");

		record.setFieldValue("First_Name", infocasas.getNombre());
		record.setFieldValue("Last_Name", infocasas.getApellido());
		record.setFieldValue("Email", infocasas.getEmail());
		record.setFieldValue("Mobile", infocasas.getTelefono());
		record.setFieldValue("DNI", infocasas.getDni());
		record.setFieldValue("Horario", infocasas.getHorario());
		record.setFieldValue("Proyecto", infocasas.getProyecto());
		record.setFieldValue("Origen", infocasas.getOrigen());
		record.setFieldValue("UTM_Source", infocasas.getUtm_source());
		record.setFieldValue("UTM_Medium", infocasas.getUtm_medium());
		record.setFieldValue("Industria", infocasas.getIndustria());
		record.setFieldValue("Lead_Source", "Infocasas");
//		
		List<CommonUtil.Trigger> triggers = Arrays.asList(CommonUtil.Trigger.workflow, CommonUtil.Trigger.approval,
				CommonUtil.Trigger.blueprint);
		APIResponse response = record.create(triggers);
		String dataJson = response.getResponseJSON().toString();
		log.info(dataJson);
		registro = formatJSON.fromJson(dataJson, registro.getClass());
		return registro;
	}

}
