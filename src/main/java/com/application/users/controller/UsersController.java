package com.application.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.users.model.User;
import com.application.users.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("users")
	public Iterable<User> getUsers() {
		return usersService.getUsers(); 
	}

}
