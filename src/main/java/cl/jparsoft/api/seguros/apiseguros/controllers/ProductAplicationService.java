package cl.jparsoft.api.seguros.apiseguros.controllers;

import org.springframework.stereotype.Service;

import cl.jparsoft.api.seguros.apiseguros.endpoints.ProductService;

@Service("productService")
public class ProductAplicationService implements ProductService {

    @Override
    public String testEndpoint() {
        return " Endpoint funcionando";
    }

}
