package com.poc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	private Integer userId;

	@Column(name = "userName", nullable = false)
	private String userName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_Id")
	private List<Transaction> transaction;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
}
