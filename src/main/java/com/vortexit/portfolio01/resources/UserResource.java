package com.vortexit.portfolio01.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vortexit.portfolio01.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	//Comentário
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
