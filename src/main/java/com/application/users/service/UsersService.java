package com.application.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.users.dao.UsersDao;
import com.application.users.model.User;

@Service
public class UsersService {
	
	@Autowired
	private UsersDao usersDao;

	public Iterable<User> getUsers() {
		return usersDao.findAll();
	}

	public User save(User user) {
		return usersDao.save(user);
	}
}
