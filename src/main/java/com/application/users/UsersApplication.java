package com.application.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.users.model.User;
import com.application.users.service.UsersService;

@SpringBootApplication
public class UsersApplication implements CommandLineRunner{
	
	@Autowired
	private UsersService usersService;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setId(1L);
		user.setFirstName("Venkateshwara");
		user.setLastName("Usirikayala");
		usersService.save(user);
	}

}

