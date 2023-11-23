package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.Repository;
import com.example.service.UserService;



@Service

public class UserServiceImpl implements UserService {
    @Autowired
	private Repository repository;
	
	
	@Override
	public User createUser(User user) {
		return repository.save(user);
		
		
	}

}
