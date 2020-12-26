package com.basant.basant.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.basant.model.User;

@RestController
@RequestMapping("api/users")
public class UserController {

	private static List<User> user=Arrays.asList(
			new User(1,"Basant"),
			new User(2,"Sneha"),
			new User(3,"Sarah")
			);
	
	@GetMapping(path="{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {
		return user.stream()
				.filter(u->userId.equals(u.getUserId()))
				.findFirst()
				.orElseThrow(()->new IllegalStateException("User"+userId+"does not exist."));
	}
	
}
