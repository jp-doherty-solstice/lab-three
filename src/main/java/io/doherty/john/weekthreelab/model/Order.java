package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private int orderNumber;

    private Timestamp orderDate;

//    private Address shippingAddress;

//    private LineItems lineItems;

    private double totalPrice;

}
