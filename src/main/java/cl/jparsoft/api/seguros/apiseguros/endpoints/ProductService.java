package cl.jparsoft.api.seguros.apiseguros.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public interface ProductService {

    @PostMapping(value="productService/testEndpoint")
    public String testEndpoint();
    
    
}
