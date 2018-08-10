package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Address;
import io.doherty.john.weekthreelab.model.OrderDetail;
import io.doherty.john.weekthreelab.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts/{id}/addresses")
    Set<Address> getAddresses(@PathVariable Long id) {
        return this.accountRepository.getAddresses(id);
    }

    @GetMapping("/accounts/{id}/orders")
    List<OrderDetail> getOrders(@PathVariable Long id) {
        return accountRepository.getOrders(id);
    }

}
