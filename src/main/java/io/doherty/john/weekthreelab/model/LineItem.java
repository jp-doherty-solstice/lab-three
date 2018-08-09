package io.doherty.john.weekthreelab.model;

import javax.persistence.*;

@Entity
@Table(name = "lineItems")
public class LineItem {

    @Id
    @GeneratedValue
    private long lineItemsId;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    private OrderDetail orderDetail;


    private int quantity;

    private double totalPrice;

//    private Shipment shipment;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
