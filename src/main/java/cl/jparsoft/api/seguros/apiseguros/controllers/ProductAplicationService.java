package cl.jparsoft.api.seguros.apiseguros.controllers;

import java.util.Date;

import org.springframework.stereotype.Service;

import cl.jparsoft.api.seguros.apiseguros.endpoints.ProductService;

@Service("productService")
public class ProductAplicationService implements ProductService {

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
    public String getStatus() {
        return new Date().toString();

    }

}
