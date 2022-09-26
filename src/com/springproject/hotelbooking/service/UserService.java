package com.springproject.hotelbooking.service;

import com.springproject.hotelbooking.entity.UserEntity;

public interface UserService {

	public void saveUser(UserEntity user);

	public UserEntity getUserId(String username);
}
