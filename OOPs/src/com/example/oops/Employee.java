package com.example.oops;

import java.util.List;

public class Employee{
	int id;
	String firstName;
	String lastName;
	List<Role> roles;
	Address address;
	Phone phone;
	
	public Employee(){}
	
	public Employee(int id,String firstName, String lastName)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", roles=" + roles
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
}
