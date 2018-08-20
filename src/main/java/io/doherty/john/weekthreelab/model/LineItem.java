package io.doherty.john.weekthreelab.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "lineItems")
public class LineItem {

    @Id
    @GeneratedValue
    private long lineItemId;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "orderNumber")
    @JsonIgnore
    private OrderDetail orderDetail;

    private int quantity;

    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "shipmentId")
    @JsonIgnore
    private Shipment shipment;

    public LineItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        setTotalPrice(this.product.getPrice() * this.quantity);
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setTotalPrice(this.product.getPrice() * this.quantity);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
