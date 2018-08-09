package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetail, Long> {
}
