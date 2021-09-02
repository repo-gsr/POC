package com.poc.service;

import java.util.Optional;

import com.poc.model.User;

public interface IUserService {
	User createUserAlongoWithTransaction(User user);
	Optional<User> getUserRewardsByUserId(int userId);
}
