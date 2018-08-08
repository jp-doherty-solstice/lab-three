package io.doherty.john.weekthreelab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LineItems {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Product product;

    private int quantity;

    private double totalPrice;

//    private Shipment shipment;

}
