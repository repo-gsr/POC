package com.poc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.Transaction;
import com.poc.rest.dto.TransactionDto;
import com.poc.service.TransactionService;

@RestController("/v1/reward")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@PostMapping
	public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDto transaction) {
		return new ResponseEntity<>(transactionService.createTransaction(transaction.toModel()), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Transaction>> getPaymentPlans() {
		return new ResponseEntity<>(transactionService.getAllTransactionWithRewardPoints(), HttpStatus.OK);
	}
}
