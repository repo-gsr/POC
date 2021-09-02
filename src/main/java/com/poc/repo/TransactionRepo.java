package com.poc.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.model.User;

public interface TransactionRepo extends JpaRepository<User, Integer>{
	
}
