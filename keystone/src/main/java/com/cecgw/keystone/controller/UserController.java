package com.cecgw.keystone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cecgw.keystone.entity.UserEntity;
import com.cecgw.keystone.service.UserService;

@RestController
@RequestMapping(value = "/keystone/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/getAll")
	List<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/getUserInfo/{id}")
	UserEntity getUserInfoById(@PathVariable("id") long id) {
		return userService.getUserInfoById(id);
	}

	@RequestMapping(value = "/add")
	Object addUser(@RequestBody UserEntity user) {
		userService.addUser(user);
		return null;
	}
	
	@RequestMapping(value = "/update/{id}")
	Object updateUserInfo(@PathVariable("id") long id,
			@RequestBody UserEntity user) {
		userService.updateUserInfo(id, user);
		return null;
	}
	
	@RequestMapping(value = "/delete/{id}")
	Object deleteUserInfo(@PathVariable("id") long id) {
		userService.deleteUserById(id);
		return null;
	}
}
