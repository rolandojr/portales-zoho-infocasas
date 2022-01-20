package com.spring.infocasas.app.configuration;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

@Component
public class InfocasasConfiguration {

	
	public void configurationZoho() {
		HashMap<String, String> zcrmConfigurations = new HashMap<String, String>();
		zcrmConfigurations.put("minLogLevel", "OFF");
		zcrmConfigurations.put("currentUserEmail", "adminzoholpd@losportalesdepas.com.pe");//
		zcrmConfigurations.put("client_id", "1000.K93T18BEKQOKG8684AU6JE14HY1ECL");//
		zcrmConfigurations.put("client_secret", "57ab9fb63c44c36c4b658d77182ae1ed3bb23e19df");//
		zcrmConfigurations.put("redirect_uri", "https://www.google.com/response");
		zcrmConfigurations.put("persistence_handler_class", "com.zoho.oauth.clientapp.ZohoOAuthFilePersistence");
		zcrmConfigurations.put("oauth_tokens_file_path","C:\\Users\\rolan\\Documents\\m4g-projects\\spring-boot-los-portales-info-casas\\src\\main\\java\\path_to_tokens\\token-infocasas.properties");
//		zcrmConfigurations.put("oauth_tokens_file_path", "/opt/los-portales/token-infocasas.properties");
		zcrmConfigurations.put("domainSuffix", "com");// optional. Default is com. "cn" and "eu" supported
		zcrmConfigurations.put("accessType", "Production");// Production->www(default), Development->developer,// Sandbox->sandbox(optional)
//		zcrmConfigurations.put("accessType", "Sandbox");// Production->www(default), Development->developer,// Sandbox->sandbox(optional)
		 zcrmConfigurations.put("scope","ZohoCRM.modules.ALL,ZohoCRM.settings.ALL,Aaaserver.profile.read");
		try {
			ZCRMRestClient.initialize(zcrmConfigurations);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
