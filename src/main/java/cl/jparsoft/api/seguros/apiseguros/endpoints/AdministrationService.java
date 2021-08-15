package cl.jparsoft.api.seguros.apiseguros.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.jparsoft.api.seguros.apiseguros.models.ResponseBO;

@RestController
public interface AdministrationService {

    @PostMapping(value = "administrationService/addsProducts")
    public ResponseBO<String> addsProducts(ResponseBO<Void> request);
    
    @PostMapping(value = "administrationService/deleteProduct")
    public ResponseBO<String> deleteProduct(ResponseBO<Void> request);
    
    @PostMapping(value = "administrationService/updateProduct")
    public ResponseBO<String> updateProduct(ResponseBO<Void> request);
    
    @PostMapping(value = "administrationService/listProducts")
    public ResponseBO<String> listProducts(ResponseBO<Void> request);
}
