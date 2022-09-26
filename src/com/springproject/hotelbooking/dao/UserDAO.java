package com.springproject.hotelbooking.dao;


import org.springframework.stereotype.Repository;
import com.springproject.hotelbooking.entity.UserEntity;

@Repository
public interface UserDAO 
{
	public void saveUser(UserEntity userEntity);

	public UserEntity getUserId(String username);
	
	

}
