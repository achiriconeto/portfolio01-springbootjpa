package com.vortexit.portfolio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vortexit.portfolio01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
