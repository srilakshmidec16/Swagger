package com.example.swagger.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
public class User implements Serializable {
	@Id
	@GeneratedValue
	private Long userId;
	private String userName;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User(Long userId, String userName) {
		super();
		userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	public User() {
		super();
	}
	
	
	
	
}
