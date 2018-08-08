package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
