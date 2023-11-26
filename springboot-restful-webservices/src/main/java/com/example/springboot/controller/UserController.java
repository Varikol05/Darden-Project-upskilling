package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dto.UserDto;
import com.example.springboot.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Tag(
		name = "Crud REST APIs for User Resource",
		description = "CRUD REST APIs - Create User, Get User, Get All Users, Delete User"
		)

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    @Autowired
	private UserService userService;

    
    @Operation(
    	summary = "Create User REST API",
    	description = "Create User REST API is used to save user in a database"
    	)
    
    @ApiResponse(
    	responseCode = "201",
    	description = "HTTP Status 201 CREATED"
    		)
    
	@PostMapping()
	public ResponseEntity<UserDto> saveUser(@Valid @RequestBody UserDto user) {
		UserDto savedUser = userService.createUser(user);
		return new ResponseEntity<UserDto>(savedUser, HttpStatus.CREATED);

	}
    

    @Operation(
    	summary = "Get User By Id REST API",
    	description = " Get User By Id REST API is used to get a single user from the database"
    	)
    
    @ApiResponse(
    	responseCode = "200",
    	description = "HTTP Status 201 SUCCESS"
    		)

	@GetMapping("{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") long userId) {
		UserDto user = userService.getUserById(userId);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);

	}

    
    @Operation(
        	summary = "Get All User REST API",
        	description = " Get All the Users from the database"
        	)
        
        @ApiResponse(
        	responseCode = "200",
        	description = "HTTP Status 201 SUCCESS"
        	)
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> users = userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);

	}
    
    @Operation(
        	summary = "Update User REST API",
        	description = " Update User REST API is used to update a perticular in the database"
        	)
        
        @ApiResponse(
        	responseCode = "200",
        	description = "HTTP Status 201 SUCCESS"
        	)

	@PutMapping("{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId, @RequestBody @Valid UserDto user) {
		user.setId(userId);
		UserDto updateUser = userService.updateUser(user);
		return new ResponseEntity<UserDto>(updateUser, HttpStatus.OK);
	}
    
    @Operation(
        	summary = "Delete User REST API",
        	description = " Delete REST API is used to delete a perticular user from the database"
        	)
        
        @ApiResponse(
        	responseCode = "200",
        	description = "HTTP Status 201 SUCCESS"
        	)

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<String>("user Deleted Successfully", HttpStatus.OK);
	}

}
