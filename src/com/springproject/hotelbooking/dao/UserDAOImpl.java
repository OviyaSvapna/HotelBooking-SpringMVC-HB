package com.springproject.hotelbooking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.hotelbooking.entity.Room;
import com.springproject.hotelbooking.entity.UserEntity;


@Repository
public class UserDAOImpl  implements UserDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(UserEntity userEntity) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(userEntity);
	}

	@Override
	public UserEntity getUserId(String userName) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<UserEntity> theQuery = currentSession.createQuery("from UserEntity where userName=:userName");
		theQuery.setParameter("userName",userName);
		List<UserEntity> user = theQuery.getResultList();
		UserEntity userid = user.get(0);
		return userid;
	}

}
