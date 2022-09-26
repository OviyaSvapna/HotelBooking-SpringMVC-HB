package com.springproject.hotelbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springproject.hotelbooking.dao.UserDAO;
import com.springproject.hotelbooking.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserDAO userDAO;
	
	@Override
	@Transactional
	public void saveUser(UserEntity userProfile) {
		userDAO.saveUser(userProfile);
	}

	@Override
	@Transactional
	public UserEntity getUserId(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserId(username);
	}
}
