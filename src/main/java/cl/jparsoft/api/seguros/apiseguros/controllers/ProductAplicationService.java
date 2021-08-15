package cl.jparsoft.api.seguros.apiseguros.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jparsoft.api.seguros.apiseguros.endpoints.ProductService;
import cl.jparsoft.api.seguros.apiseguros.models.Metadata;
import cl.jparsoft.api.seguros.apiseguros.models.ResponseBO;
import cl.jparsoft.api.seguros.helper.ErrorMessageHelper;

@Service("productService")
public class ProductAplicationService implements ProductService {

	// @Autowired
	//public ErrorMessageHelper errorMessageHelper;

	@Override
	public String testEndpoint() {
		return " Endpoint funcionando";
	}

	@Override
	public String evaluateProducts() {

		return "evaluateProducts";
	}

	@Override
	public String sellProducts() {

		return "sellProducts";
	}

	@Override
	public String listProducts() {

		return "listProducts";
	}

	@Override
	public ResponseBO<String> getStatus() {
		ResponseBO<String> response = new ResponseBO<>();
		Metadata metadata = new Metadata();
		try {
			metadata.setCode(0);
			metadata.setMessage("response ok");
			response.setData(new Date().toString());

		} catch (Exception e) {
		//	errorMessageHelper.setError(metadata, e.getMessage());
		}

		return response;
	}

}
