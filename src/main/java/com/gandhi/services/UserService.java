package com.gandhi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gandhi.models.User;
import com.gandhi.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	// GET
	public Optional<User> findUserById(Long id){
		return userRepository.findById(id);
	}
	
	// POST
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	// PUT
	
	//DELETE
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
}
