package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.Transaction;
import com.poc.repo.TransactionRepo;

@Service
public class TransactionService implements ITransactionService {

	long rewardPoints;

	@Autowired
	TransactionRepo transactionRepo;

	@Override
	public Transaction createTransaction(Transaction tr) {
		if (tr.getTotalAmount() > 50 && tr.getTotalAmount() <= 100) {
			rewardPoints += (tr.getTotalAmount().intValue() - 50) * 1;
			tr.setRewardPoints(rewardPoints);

		}

		if (tr.getTotalAmount() > 100) {
			rewardPoints += 50; // 1 point for every dollar spent over $50
			rewardPoints += (tr.getTotalAmount().intValue() - 100) * 2; // 2 points for every dollar spent over $100
			tr.setRewardPoints(rewardPoints);
		}

		return transactionRepo.save(tr);
	}

	public List<Transaction> getAllTransactionWithRewardPoints() {
		return transactionRepo.findAll();
	}

}
