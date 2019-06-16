package com.example.oops;

import java.util.LinkedList;
import java.util.List;

public class HRService {

	List<Employee> employeeList = new LinkedList<Employee>();
	
	void addEmployee(Employee e) {
		
		employeeList.add(e);	
		
		System.out.println("Employee succesfully created");
	}

	int removeEmployee(int id) {
		
		Employee em;
		em=employeeList.get(id);
		System.out.println(em.firstName);
		System.out.println(em.getRoles());
		boolean res = employeeList.remove(em);
		if(res ==  true) 
		{
			return 1;
		}
		else
		
		{
			return 0;
		}
	}

	
	Employee search(int id) {
		Employee em;
		em =  employeeList.get(id);
		return em;
	}

}
