package com.poc.rest.dto;

import com.poc.model.Transaction;

public class TransactionDto {
	private Double totalAmount;

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Transaction toModel() {
        Transaction tr = new Transaction();
        tr.setTotalAmount(this.totalAmount);
		return tr;
	}
	
}
