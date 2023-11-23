package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.User;

public interface Repository extends MongoRepository<User, Long>{

}
