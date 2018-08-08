package io.doherty.john.weekthreelab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LineItems {

    @Id
    @GeneratedValue
    private long id;

//    private Product product;

    private int quantity;

//    private double price;

    private double totalPrice;

//    private Shipment shipment;

}
