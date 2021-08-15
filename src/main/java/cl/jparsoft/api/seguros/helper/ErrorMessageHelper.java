package cl.jparsoft.api.seguros.helper;

import org.springframework.stereotype.Component;

import cl.jparsoft.api.seguros.apiseguros.models.Metadata;

@Component("errorMessageHelper")
public class ErrorMessageHelper {
	
	public Metadata setError(Metadata metadata, String error) {
		metadata.setCode(1);
		metadata.setMessage(error);
		return metadata;
		
	}

}
