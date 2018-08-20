package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderDetail, Long> {

    @Query("select o from OrderDetail o where o.account.accountId = ?1")
    List<OrderDetail> getAllOrders(Long id);

}
