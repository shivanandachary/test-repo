package com.spring.data.jpa.demp.springdatajpapostgres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.jpa.demp.springdatajpapostgres.model.User;
import com.spring.data.jpa.demp.springdatajpapostgres.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	public String saveUser(User user) {
		
		user = userRepository.save(user);
		return user.getName();
	}	

}
