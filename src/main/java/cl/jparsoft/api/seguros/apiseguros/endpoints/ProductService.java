package cl.jparsoft.api.seguros.apiseguros.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public interface ProductService {

    @PostMapping(value = "productService/testEndpoint")
    public String testEndpoint();

    @PostMapping(value = "productService/evaluateProducts")
    public String evaluateProducts();

    @PostMapping(value = "productService/sellProducts")
    public String sellProducts();

    @PostMapping(value = "productService/listProducts")
    public String listProducts();

    @GetMapping(value = "/")
    public String getStatus();

}
