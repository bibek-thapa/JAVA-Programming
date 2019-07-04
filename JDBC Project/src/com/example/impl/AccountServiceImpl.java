package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Account;
import com.example.entity.Result;
import com.example.iService.AccountService;
import com.example.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	AccountRepository accountRepo = new AccountRepository();

	@Override
	public Result add(Account t) {
		Result result = null;

		result = accountRepo.add(t);

		System.out.println(result.toString() + " adding the elements in the Account table");
	
		return result;
	}

	@Override
	public Result remove(Account t) {
		Result result = null;
		result = accountRepo.remove(t);
		System.out.println(result.toString() + " Removing the elements from the account table");
		return result;
	}

	@Override
	public Result update(Account t) {
		Result result = null;
		result = accountRepo.update(t);

		System.out.println(result.toString() + " Updating the elements in account table");

		return result;
	}

	@Override
	public Account find(Long id) {
		Account account = new Account();
		account = accountRepo.find(id);
		if (account.getBank() == (null)) {
			System.out.println("No element founded");
			return account;
		} else {
			System.out.println(account.toString() + " Found this element in Account Table");
			return account;
		}
	}

	@Override
	public List<Account> find(String name) {
		List<Account> accountList = new ArrayList<>();

		accountList = accountRepo.find(name);
		System.out.println(accountList.size());
		System.out.println(accountList.toString() + " Found these elements in Account Table");
		return accountList;
	}

}
