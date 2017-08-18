package com.cecgw.keystone.service;

import java.util.List;

import com.cecgw.keystone.entity.UserEntity;

public interface UserService {

	public List<UserEntity> getAllUsers();
	public UserEntity getUserInfoById(long id);
	public void addUser(UserEntity user);
	public void updateUserInfo(long id, UserEntity user);
	public void deleteUserById(long id);
}
