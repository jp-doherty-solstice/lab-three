package io.doherty.john.weekthreelab.restcontrollers;

import io.doherty.john.weekthreelab.model.Account;
import io.doherty.john.weekthreelab.model.Address;
import io.doherty.john.weekthreelab.repository.AccountRepository;
import io.doherty.john.weekthreelab.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/create")
    void createAddress(@RequestBody Account account) {
        accountRepository.save(account);

//        Account account = accountRepository.findById(accountId).get();
//        Address address = new Address(street, apt, city, state, zipcode, country);
//        account.addAddress(address);
//        addressRepository.save(address);
    }

    @GetMapping("/read/address/{id}")
    Optional<Address> getAddress(@PathVariable long id) {
        return addressRepository.findById(id);
    }


}
