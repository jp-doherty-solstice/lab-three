package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
public class Shipment {

    @Id
    @GeneratedValue
    private long shipmentId;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @OneToMany
    private List<LineItem> lineItems;

    public Shipment() {
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        this.account = shippingAddress.getAccount();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        this.shippingAddress = lineItems.get(0).getOrderDetail().getShippingAddress();
    }

//
//    private Timestamp shippedDate;
//
//    private Timestamp deliveryDate;

}
