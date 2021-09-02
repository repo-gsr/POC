package com.poc.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.User;
import com.poc.rest.dto.UserDto;
import com.poc.service.UserService;

@RestController
@RequestMapping("/v1/reward")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody UserDto user) {
		return new ResponseEntity<>(userService.createUserAlongoWithTransaction(user.toModel()), HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "userId") Integer userId) {
		return new ResponseEntity<>(userService.getUserRewardsByUserId(userId), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsersAndTransactions() {
		return new ResponseEntity<>(userService.getAllUsersAlongoWithTransactions(), HttpStatus.OK);
	}
}
