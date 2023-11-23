package com.example.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;



@RestController


@RequestMapping("users")
public class Controller {
	@Autowired
	private UserService userService;
	
	
	//Build create User REST API
	@PostMapping()
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser = userService.createUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
		
	}
	

}
