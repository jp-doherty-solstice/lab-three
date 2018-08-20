package io.doherty.john.weekthreelab.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
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
    private Set<LineItem> lineItems;

    private Timestamp shippedDate;

    private Timestamp deliveryDate;

    public Shipment() {
        this.shippedDate = new Timestamp(System.currentTimeMillis());
    }

    public long getShipmentId() {
        return shipmentId;
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
        setAccount(shippingAddress.getAccount());
    }

    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
        List<LineItem> list = new ArrayList<>(lineItems);
        setShippingAddress(list.get(0).getOrderDetail().getShippingAddress());
        lineItems.forEach(lineItem -> lineItem.setShipment(this));
    }

    public Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
