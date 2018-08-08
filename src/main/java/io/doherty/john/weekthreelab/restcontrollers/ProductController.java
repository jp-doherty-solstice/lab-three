package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Product;
import io.doherty.john.weekthreelab.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/create/product/{name}/{description}/{image}/{price}")
    void createProduct(@PathVariable String name, @PathVariable String description,
                       @PathVariable String image, @PathVariable Double price) {
        productRepository.save(new Product(name, description, image, price));
    }

}
