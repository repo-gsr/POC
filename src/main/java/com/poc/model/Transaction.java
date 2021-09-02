package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Transaction")
@Getter @Setter
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionId", unique = true)
	private Long transactionId;

	@Column(name = "totalAmount")
	private Double totalAmount;
	
	@Column(name = "rewardPoints", nullable = true)
	private long rewardPoints;

	@ManyToOne
	private User user;

}
