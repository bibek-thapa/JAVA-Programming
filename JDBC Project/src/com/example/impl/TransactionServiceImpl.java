package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Result;
import com.example.entity.Transaction;
import com.example.iService.TransactionService;
import com.example.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService{

	TransactionRepository transactionRepo = new TransactionRepository();

	@Override
	public Result add(Transaction t) {
		Result result = null;

		result = transactionRepo.add(t);

		System.out.println(result.toString() + " adding the elements in the Transaction table");
	
		return result;
	}

	@Override
	public Result remove(Transaction t) {
		Result result = null;
		result = transactionRepo.remove(t);
		System.out.println(result.toString() + " Removing the elements from the transaction table");
		return result;
	}

	@Override
	public Result update(Transaction t) {
		Result result = null;
		result = transactionRepo.update(t);

		System.out.println(result.toString() + " Updating the elements in transaction table");

		return result;
	}

	@Override
	public Transaction find(Long id) {
		Transaction transaction = new Transaction();
		transaction = transactionRepo.find(id);
		if (transaction.getAccount() == (null)) {
			System.out.println("No element founded");
			return transaction;
		} else {
			System.out.println(transaction.toString() + " Found this element in Transaction Table");
			return transaction;
		}
	}

	@Override
	public List<Transaction> find(String name) {
		List<Transaction> transactionList = new ArrayList<>();

		transactionList = transactionRepo.find(name);
		System.out.println(transactionList.size());
		System.out.println(transactionList.toString() + " Found these elements in Transaction Table");
		return transactionList;
	}

}
