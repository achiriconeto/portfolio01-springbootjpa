package com.vortexit.portfolio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vortexit.portfolio01.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
