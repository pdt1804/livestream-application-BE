package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public String authenticate(String userName, String passWord) {
		Optional<User> existingUser = userRepository.findAll().stream().filter((user) -> user.getUserName().equals(userName)).findAny();
		if (existingUser.isPresent() && existingUser.get().getPassWord().equals(passWord)) {
			return existingUser.get().getUserName() + "-" + existingUser.get().getNickName();
		} else {
			return "001 - Username or Password are not correct !";
		}
		
	}
	
	public String createAccount(User user) {
		boolean isUserNameExisted = userRepository.findAll().stream().anyMatch((existingUser) -> existingUser.getUserName().equals(user.getUserName()));
		if (isUserNameExisted) {
			return "002 - Username already existed !";
		} 
		
		if (user.getYearOfBirth() > new Date().getYear()) {
			return "003 - Invalid year of birth !";
		}
		
		userRepository.save(user);
		return user.getUserName() + "-" + user.getNickName();
	}
}
