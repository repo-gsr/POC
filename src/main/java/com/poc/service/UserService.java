package com.poc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.Transaction;
import com.poc.model.User;
import com.poc.repo.TransactionRepo;

@Service
public class UserService implements IUserService {

	@Autowired
	TransactionRepo transactionRepo;

	@Override
	public User createUserAlongoWithTransaction(User user) {
		long rewardPoints = 0;

		List<Transaction> transactions = new ArrayList<>();

		for (Transaction tr : user.getTransaction()) {

			if (tr.getTotalAmount() > 50 && tr.getTotalAmount() <= 100) {
				rewardPoints += (tr.getTotalAmount().intValue() - 50) * 1;
				tr.setRewardPoints(rewardPoints);

			}

			if (tr.getTotalAmount() > 100) {
				rewardPoints += 50; // 1 point for every dollar spent over $50
				rewardPoints += (tr.getTotalAmount().intValue() - 100) * 2; // 2 points for every dollar spent over $100
				tr.setRewardPoints(rewardPoints);
			}
			transactions.add(tr);
		}
		user.setTransaction(transactions);

		return transactionRepo.save(user);
	}

	public List<User> getAllUsersAlongoWithTransactions() {
		return transactionRepo.findAll();
	}

	@Override
	public Optional<User> getUserRewardsByUserId(int userId) {
		return transactionRepo.findById(userId);
	}

}
