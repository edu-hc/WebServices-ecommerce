package com.webser.ecommerce.repositories;

import com.webser.ecommerce.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
