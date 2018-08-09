package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}
