package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

//    @PostMapping("/create/order/{accountId}/")

}
