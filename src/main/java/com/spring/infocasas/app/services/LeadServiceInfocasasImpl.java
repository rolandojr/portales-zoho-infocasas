package com.spring.infocasas.app.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.infocasas.app.models.Infocasas;
import com.spring.infocasas.app.repositories.ILeadRepositoryInfocasas;
import com.zoho.crm.library.exception.ZCRMException;

@Service
public class LeadServiceInfocasasImpl implements ILeadServiceInfocasas {

	@Autowired
	private ILeadRepositoryInfocasas leadRepositoryInfocasas;
	
	@Override
	public Map<String, Object> createNewLead(Infocasas infocasas) throws ZCRMException {
		// TODO Auto-generated method stub
		return leadRepositoryInfocasas.createNewLead(infocasas);
	}

	
}
