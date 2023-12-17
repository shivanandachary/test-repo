package com.spring.data.jpa.demp.springdatajpapostgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.demp.springdatajpapostgres.model.User;
import com.spring.data.jpa.demp.springdatajpapostgres.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/user/1")
	public User getUser() {
		return new User(1,"Shivananda","password");
	}
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
}
