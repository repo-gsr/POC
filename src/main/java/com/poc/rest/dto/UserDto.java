package com.poc.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.poc.model.Transaction;
import com.poc.model.User;

public class UserDto {
	private String userName;
	private List<TransactionDto> transactions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<TransactionDto> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDto> transactions) {
		this.transactions = transactions;
	}
	
	public User toModel() {
		User user = new User();
		user.setUserName(this.userName);
		user.setTransaction(loadTransactions(this.transactions));
		return user;
	}
	public List<Transaction> loadTransactions(List<TransactionDto> transactiondto){
		List<Transaction> transactions = new ArrayList<>();
		for(TransactionDto transaction: transactiondto ) {
			Transaction txn = new Transaction();
			txn.setTotalAmount(transaction.getTotalAmount());
			transactions.add(txn);
		}
		return transactions;
	}

}
