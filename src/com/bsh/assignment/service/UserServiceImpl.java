package com.bsh.assignment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsh.assignment.dao.UserRepository;
import com.bsh.assignment.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User getUser(String check_email, String check_password) {
	
		return userRepository.getUser(check_email , check_password);
	}

}
