package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
