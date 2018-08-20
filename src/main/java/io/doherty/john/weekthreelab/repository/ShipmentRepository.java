package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    @Query("select s from Shipment s where s.account.accountId = ?1")
    List<Shipment> getShipmentsByAccount(Long accountId);

}
