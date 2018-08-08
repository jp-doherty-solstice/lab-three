package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.LineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemsRepository extends JpaRepository<LineItems, Long> {
}
