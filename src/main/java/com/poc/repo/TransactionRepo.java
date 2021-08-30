package com.poc.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long>{
	
}
