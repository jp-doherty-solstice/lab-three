package io.doherty.john.weekthreelab.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long accountId;

    private String firstName;

    private String lastName;

    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Address> addresses;

    @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "accountId")
    @JsonIgnore
    private List<OrderDetail> orders;

    public Account() {}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmailAddress(String email) {
        this.email = email;
    }
    public void addAddress(Address address) {
        addresses.add(address);
    }
    public void removeAddress(Address address) {
        addresses.remove(address);
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
    public List<OrderDetail> getOrders() {
        return orders;
    }
    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }

}
