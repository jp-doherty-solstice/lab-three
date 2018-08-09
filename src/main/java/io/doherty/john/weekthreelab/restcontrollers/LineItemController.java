//package io.doherty.john.weekthreelab.restcontrollers;
//
//import io.doherty.john.weekthreelab.model.LineItem;
//import io.doherty.john.weekthreelab.repository.LineItemRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class LineItemController {
//
//    @Autowired
//    LineItemRepository lineItemRepository;
//
//    @PostMapping("/line_item")
//    void createLineItem(@RequestBody LineItem lineItem) {
//        lineItemRepository.save(lineItem);
//    }
//
//}
