package com.example.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Bank;
import com.example.entity.Result;
import com.example.iService.BankService;
import com.example.repository.BankRepository;

public class BankServiceImpl implements BankService{

	BankRepository bankRepo = new BankRepository();
	@Override
	public Result add(Bank t) {
		Result result=null;
		
		result = bankRepo.add(t);
		
		System.out.println(result.toString()+ " adding the elements in the Bank table");
		System.out.println("Elements added = "+ t.getName());
		return result;
	}

	@Override
	public Result remove(Bank t) {
		Result result=null;
		result = bankRepo.remove(t);
		System.out.println(result.toString() + " Removing the elements from the bank table");
		return result;
	}

	@Override
	public Result update(Bank t) {
		Result result=null;
		result = bankRepo.update(t);
		
		System.out.println(result.toString() + " Updating the elements");
		
		return result;
	}

	@Override
	public Bank find(Long id)
	{
		Bank bank = new Bank();
		bank = bankRepo.find(id);
		if(bank.getName()==(null)) 
		{
			System.out.println("No element founded");
			return bank;
		}
		else {
		System.out.println(bank.toString() + " Found this element");
		return bank;
		}
	}

	@Override
	public List<Bank> find(String name) {
		List<Bank> bankList = new ArrayList<>();
		
		bankList = bankRepo.find(name);
		System.out.println(bankList.size());
		System.out.println(bankList.toString() + " Found these elements");
		return bankList;
	}

}
