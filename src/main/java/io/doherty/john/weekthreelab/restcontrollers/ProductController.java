package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Product;
import io.doherty.john.weekthreelab.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    void createProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
