              package com.example.springboot.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.User;
import com.example.springboot.exception.EmailAlreadyExistsException;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.mapper.AutoUserMapper;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepo;
    
    @Autowired
    private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		//converting UserDto to User Jpa Entity
		
//		User user= UserMapper.mapToUser(userDto);
		
//		User user= modelMapper.map(userDto,User.class );
		
		
		Optional<User> optionalUser = userRepo.findByEmail(userDto.getEmail());
		if(optionalUser.isPresent()) {
		throw new EmailAlreadyExistsException("Email already exists for user");	
		}
		
		User user= AutoUserMapper.Mapper.mapToUser(userDto);
		
		User savedUser = userRepo.save(user);
		
		//convert User Jpa Entity into User Dto	
		
//		UserDto savedUserDto= UserMapper.mapToUserDto(savedUser);
		
//		UserDto savedUserDto= modelMapper.map(savedUser, UserDto.class);
		
		UserDto savedUserDto= AutoUserMapper.Mapper.mapToUserDto(savedUser);
		return savedUserDto;
		}
	

	@Override
	public UserDto getUserById(Long userId) {
		// TODO Auto-generated method stub
		User user = userRepo.findById(userId).orElseThrow(
			() -> new ResourceNotFoundException("User", "id", userId)	
				);
	
//		return UserMapper.mapToUserDto(user);
		
//		return modelMapper.map(user,  UserDto.class);
		
		
		return AutoUserMapper.Mapper.mapToUserDto(user);
	
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		 List<User> users = userRepo.findAll();
//		 return users.stream().map(UserMapper::mapToUserDto)
//				 .collect(Collectors.toList());
		 
//		 return users.stream().map((user) ->modelMapper.map(user,  UserDto.class))
//				 .collect(Collectors.toList());
		 
		 return users.stream().map((user) ->AutoUserMapper.Mapper.mapToUserDto(user))
				 .collect(Collectors.toList());

	}

	@Override
	public UserDto updateUser(UserDto user) {
		// TODO Auto-generated method stub
		
		User existingUser = userRepo.findById(user.getId()).orElseThrow(
				() -> new ResourceNotFoundException("User", "id", user.getId())	
				);
		
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		User updatedUser = userRepo.save(existingUser);
//		return UserMapper.mapToUserDto(updatedUser);
		
//		return modelMapper.map(updatedUser,UserDto.class );
		
		return AutoUserMapper.Mapper.mapToUserDto(updatedUser);
		
		}

	@Override
	public void deleteUser(Long userId) {
		
		User existingUser = userRepo.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User", "id", userId)	
				);
		
		userRepo.deleteById(userId);
		
	}

}
