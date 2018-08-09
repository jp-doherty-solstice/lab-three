package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Random;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    private Timestamp orderDate;

    //    private Address shippingAddress;
    //    private LineItems lineItems;

    private double totalPrice;


    public OrderDetail() {
        Random random = new Random();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}