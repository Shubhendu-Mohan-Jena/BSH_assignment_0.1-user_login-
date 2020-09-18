package com.bsh.assignment.dao;

import java.util.List;

import com.bsh.assignment.entity.User;

public interface UserRepository {

	public User getUser( String check_email , String check_password);
}
