package com.poc.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody UserDto user) {
		logger.debug("Attempting to Create the User " + user.getUserName());
		return new ResponseEntity<>(userService.createUserAlongoWithTransaction(user.toModel()), HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "userId") Integer userId) {
		logger.debug("Get User by UserId ");
		return new ResponseEntity<>(userService.getUserRewardsByUserId(userId), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsersAndTransactions() {
		logger.debug("Get All Users ");
		return new ResponseEntity<>(userService.getAllUsersAlongoWithTransactions(), HttpStatus.OK);
	}
}
