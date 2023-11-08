package com.example.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.api.dao.UserRepository;
import com.example.swagger.api.model.User;

@Service
public class UserService {
	private static final String UserId = null;
	@Autowired
	private UserRepository repository;
	
	public String saveUser(User user){
		repository.save(user);
		return " user saved with id " + user.getUserId();
		
	}
	public User getUser(Long userId) {
		return repository.findById(userId).get();

		
	}
	public List<User> removeUser(Long userId) {
		repository.deleteById(userId);
		return repository.findAll();
	}

}
