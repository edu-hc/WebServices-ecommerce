package com.webser.ecommerce.repositories;

import com.webser.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
