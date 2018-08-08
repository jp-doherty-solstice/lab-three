package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
