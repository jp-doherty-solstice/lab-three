package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Account;
import io.doherty.john.weekthreelab.model.Address;
import io.doherty.john.weekthreelab.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/create/account/{firstName}/{lastName}/{email}")
    void createAccount(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String email) {
        accountRepository.save(new Account(firstName, lastName, email));
    }

    @GetMapping("/read/account/{id}")
    Account getAddress(@PathVariable long id) {
        return accountRepository.findById(id).get();
    }

    @GetMapping("/read/alladdresses/{id}")
    List<Address> getAllAccounts(@PathVariable long id) {
        Account account = accountRepository.findById(id).get();
        return account.getAddresses();
    }



}
