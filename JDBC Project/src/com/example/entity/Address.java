package com.example.entity;

public class Address {
	int id;
	String street1;
	String street2;
	String zip;
	String country;
	
	public Address(int id, String street1, String street2, String zip, String country) {
		this.id = id;
		this.street1 = street1;
		this.street2 = street2;
		this.zip = zip;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public String getStreet1() {
		return street1;
	}
	public String getStreet2() {
		return street2;
	}
	public String getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	
	
	
	
	

}
