package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionId", unique = true)
	private Long transactionId;

	@Column(name = "totalAmount")
	private Double totalAmount;
	

	public long getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(long rewardPoints2) {
		this.rewardPoints = rewardPoints2;
	}

	@Column(name = "rewardPoints", nullable = true)
	private long rewardPoints;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount2) {
		this.totalAmount = totalAmount2;
	}

}
