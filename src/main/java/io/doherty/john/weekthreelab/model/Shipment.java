package io.doherty.john.weekthreelab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Shipment {

    @Id
    @GeneratedValue
    private long id;

//    private Account account;
//
//    private Address shippingAddress;
//
//    private LineItems lineItems;
//
//    private Timestamp shippedDate;
//
//    private Timestamp deliveryDate;

}
