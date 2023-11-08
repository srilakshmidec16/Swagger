package com.example.swagger.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.api.model.User;
import com.example.swagger.api.service.UserService;



@RestController
@RequestMapping("/api/User")
public class UserController {
	@Autowired
	private UserService service;
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable Long userId) {
		return service.getUser(userId);
	}
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	@DeleteMapping("/deleteUser/{userId}")
	public List<User> deleteUser(@PathVariable Long userId) {
		return service.removeUser(userId);

	
	}
}
