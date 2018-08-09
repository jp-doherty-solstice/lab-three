package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "account_id")
    private Set<Address> addresses = new HashSet<>();

    public Account() {}

    public Account(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

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
    public Set<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
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
}
