package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.*;
import io.doherty.john.weekthreelab.repository.OrderRepository;
import io.doherty.john.weekthreelab.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {


    @Autowired
    private OrderRepository orderRepository;


    @Autowired
    private ShipmentRepository shipmentRepository;


    @GetMapping("/accounts/{id}/all_orders")
    List<OrderSummary> getOrders(@PathVariable Long id) {
        List<OrderDetail> orders = orderRepository.getAllOrders(id);
        return getSummariesFromOrders(orders);
    }


    private List<OrderSummary> getSummariesFromOrders(List<OrderDetail> orders) {
        List<OrderSummary> summaries = new ArrayList<>();
        for (OrderDetail orderDetail : orders) {
            OrderSummary summary = new OrderSummary();
            summary.setOrderNumber(orderDetail.getOrderNumber());
            summary.setShippingAddress(orderDetail.getShippingAddress());
            summary.setTotalPrice(orderDetail.getTotalPrice());
            summary.setLineItems(orderDetail.getLineItems());
            summaries.add(summary);
        }
        return summaries;
    }


    @GetMapping("/accounts/{account_id}/all_shipments")
    List<ShipmentSummary> getShipments(@PathVariable Long account_id) {
        List<Shipment> shipments = shipmentRepository.getShipmentsByAccount(account_id);
        return getSummariesFromShipments(shipments);
    }


    private List<ShipmentSummary> getSummariesFromShipments(List<Shipment> shipments) {
        List<ShipmentSummary> summaries = new ArrayList<>();
        for (Shipment shipment : shipments) {
            ShipmentSummary summary = new ShipmentSummary();
            summary.setOrderNumber(shipment.getShipmentId());
            summary.setShipmentDate(shipment.getShippedDate());
            summary.setDeliveryDate(shipment.getDeliveryDate());
            summary.setLineItems(shipment.getLineItems());
            summaries.add(summary);
        }
        return summaries;
    }


}
