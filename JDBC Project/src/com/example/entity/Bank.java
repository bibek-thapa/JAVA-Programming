package com.example.entity;

public class Bank {
	int id;
	String name;
	
	public Bank() 
	{}
	
	
	public Bank(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
