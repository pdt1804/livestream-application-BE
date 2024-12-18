package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/authenticate")
	public ResponseEntity<String> authenticate(@RequestParam ("userName") String userName, @RequestParam ("passWord") String passWord) {
		return ResponseEntity.ok(userService.authenticate(userName, passWord));
	}
	
	@PostMapping("/createAccount")
	public ResponseEntity<String> createAccount(@RequestBody User user) {
		return ResponseEntity.ok(userService.createAccount(user));
	}
	
}
