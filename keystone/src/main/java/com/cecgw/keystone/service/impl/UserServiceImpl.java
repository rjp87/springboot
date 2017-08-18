package com.cecgw.keystone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cecgw.keystone.dao.UserDao;
import com.cecgw.keystone.entity.UserEntity;
import com.cecgw.keystone.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public List<UserEntity> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	
	public UserEntity getUserInfoById(long id){
		return userDao.getUserInfoById(id);
	}
	
	
	public void addUser(UserEntity user){
		userDao.addUser(user);
		
	}
	
	public void updateUserInfo(long id, UserEntity user){
		user.setId(id);
		userDao.updateUserInfo(user);
		
	}
	
	public void deleteUserById(long id){
		userDao.deleteUserById(id);
	}
}
