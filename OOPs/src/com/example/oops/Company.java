package com.example.oops;

import java.util.List;

public class Company {
	int id;
	String name;
	List<Employee> employeeList;
	
	public Company(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	//Aggregation
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
