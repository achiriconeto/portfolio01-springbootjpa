package com.vortexit.portfolio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vortexit.portfolio01.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
