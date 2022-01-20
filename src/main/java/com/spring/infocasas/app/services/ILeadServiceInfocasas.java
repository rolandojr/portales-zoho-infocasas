package com.spring.infocasas.app.services;

import java.util.Map;

import com.spring.infocasas.app.models.Infocasas;
import com.zoho.crm.library.exception.ZCRMException;

public interface ILeadServiceInfocasas {

	public Map<String, Object> createNewLead(Infocasas infocasas) throws ZCRMException;
}
