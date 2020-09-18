package com.bsh.assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsh.assignment.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public User getUser( String email , String password) {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		List<User> userList = null;
		
		if( email !=null && password !=null && email.trim().length() > 0 )
		{
		//create a query
		Query<User> theQuery = 
				currentSession.createQuery
				("from User u where u.email='"+ email+"' and u.password='"+password+"'" , User.class);
		
		//execute query
		userList = theQuery.getResultList();
		
		if( userList.size() == 1 )
			return userList.get(0);
		else
			return null;
		}
		else
			return null;
	}

}
