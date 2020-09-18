package com.bsh.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsh.assignment.dao.UserRepository;
import com.bsh.assignment.entity.User;
import com.bsh.assignment.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	//need to inject the user service
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String loginUser() {
		
		return "login-user";
	}
	
	@PostMapping("/checkUser")
	public String checkUser(
			@RequestParam("check_email") String check_email, 
			@RequestParam("check_password") String check_password ,
			Model theModel) {
		
		//get user from dao
		User theUser = userService.getUser( check_email , check_password );
		
		System.out.println("\n"+ theUser + "\n");
		
		if( theUser != null )
		{
			//add the customer to model
			theModel.addAttribute("user" , theUser);
			return "dashboard";
		}
		else
		{
			String errorMessage = "Please try again with another email(and/or) password";
			theModel.addAttribute( "errorMessage",errorMessage);
			return "login-user";
		}
			
	}
}


