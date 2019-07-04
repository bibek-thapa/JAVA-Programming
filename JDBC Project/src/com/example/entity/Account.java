package com.example.entity;

public class Account {

	int id;
	
	Bank bank = null;
	Patron patron = null;


    public Account() 
    {}

	public Account(int id,Bank bank , Patron patron) {
		this.id = id;
		
		this.bank = bank;
		this.patron = patron;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Patron getPatron() {
		return patron;
	}

	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", bank=" + bank + ", patron=" + patron + "]";
	}
	
	
	




}
