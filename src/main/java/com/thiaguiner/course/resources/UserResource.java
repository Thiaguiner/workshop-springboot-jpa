package com.thiaguiner.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiaguiner.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
//controlodor que responde no caminho "/users"
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
