package com.vortexit.portfolio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vortexit.portfolio01.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
