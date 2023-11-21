package com.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.resource.UserValid;

@RestController
public class Controller {
	UserValid u = new UserValid();
	@RequestMapping("/user/{user}/pass/{pass}")
	public String valid (@PathVariable String user,@PathVariable String pass)
	{
		if(u.userval(user, pass))
			return "valid";
		else
			return "invalid";
	}
	
	
	

}
