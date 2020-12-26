package com.basant.basant.model;

public class User {

	private final Integer userId;
	
	private final String name;

	
	public User(Integer userId,String name) {
		this.userId=userId;
		this.name=name;
	}


	public Integer getUserId() {
		return userId;
	}


	public String getName() {
		return name;
	}
	
	
}
