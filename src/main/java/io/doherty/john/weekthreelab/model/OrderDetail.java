package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue
    private long orderNumber;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    private Timestamp orderDate;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @OneToMany
    private Set<LineItem> lineItems;

    private double totalPrice;

    public OrderDetail() {
        this.orderDate = new Timestamp(System.currentTimeMillis());
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

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
        this.totalPrice = 0.00;
        this.lineItems.forEach(lineItem -> {
            lineItem.setOrderDetail(this);
            this.totalPrice += lineItem.getTotalPrice();
        });
    }

}