package com.vortexit.portfolio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vortexit.portfolio01.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
