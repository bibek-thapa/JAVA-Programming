package com.example.oops;

import java.util.List;

public class Employee{
	int id;
	String firstName;
	String lastName;
	List<Role> roles;
	Address address;
	Phone phone;
	
	Employee(){}
	
	Employee(int id,String firstName, String lastName)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		
		
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	
}
