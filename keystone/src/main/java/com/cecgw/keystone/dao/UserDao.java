package com.cecgw.keystone.dao;

import java.util.List;

import com.cecgw.keystone.entity.UserEntity;

public interface UserDao {

	public List<UserEntity> getAllUsers();
	public UserEntity getUserInfoById(long id);
	public void addUser(UserEntity user);
	public void updateUserInfo(UserEntity user);
	public void deleteUserById(long id);
}
