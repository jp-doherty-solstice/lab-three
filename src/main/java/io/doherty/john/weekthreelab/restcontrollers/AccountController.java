package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Account;
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

    @PostMapping("/account")
    void createAccount(@RequestBody Account account) {
        accountRepository.save(account);
    }

    @GetMapping("/account/{id}")
    Account getAddress(@PathVariable long id) {
        return accountRepository.findById(id).get();
    }

    @GetMapping("/account/{id}/all_addresses")
    Set<Address> getAllAccounts(@PathVariable long id) {
        return accountRepository.findById(id).get().getAddresses();
    }

    @GetMapping("/account/{accountId}/all_orders")
    List<OrderDetail> getAllOrders(@PathVariable Long accountId) {
        return accountRepository.getAllOrders(accountId);
    }



}
