package io.doherty.john.weekthreelab.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public class ShipmentSummary {

    private Long orderNumber;
    private Timestamp shipmentDate;
    private Timestamp deliveryDate;
    private Set<LineItem> lineItems;

    public ShipmentSummary() {
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Timestamp getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Timestamp shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}
