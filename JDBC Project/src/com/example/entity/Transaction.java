package com.example.entity;

public class Transaction {
	int id;
	double amount;
	Account account;
	AccountType accountType;
	
	
	public Transaction() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public AccountType getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", account=" + account + ", accountType=" + accountType
				+ "]";
	}
	
	
	

}
