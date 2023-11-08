package com.example.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
