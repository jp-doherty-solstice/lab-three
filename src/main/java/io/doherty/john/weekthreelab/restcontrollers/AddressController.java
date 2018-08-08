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
    private AddressRepository addressRepository;

    @PostMapping("/address")
    void createAddress(@RequestBody Address address) {
        addressRepository.save(address);
    }

    @GetMapping("/address/{id}")
    Address getAddress(@PathVariable long id) {
        return addressRepository.findById(id).get();
    }


}
