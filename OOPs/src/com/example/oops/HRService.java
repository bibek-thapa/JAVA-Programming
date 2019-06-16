package com.example.oops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HRService
{

//	List<Employee> employeeList = new LinkedList<Employee>();
	List<Employee> employeeList;
	Map<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();
	void addEmployee(Employee e) 
	{
		
		if(e!=null)
		{
			employeeMap.put(e.getId(), e);
			System.out.println("Employee succesfully created");
		}
		else 
		{
			System.out.println("Employee cannot be blank");
		}
		
	}

	int removeEmployee(int id) 
	{
		
		employeeMap.remove(id);
		System.out.println("Employee succesfully removed");
		return 1;
		
	}
	
	Employee search(int id) 
	{
		Employee em = employeeMap.get(id);	
		return em;					
		
	}

	List<Employee> search(String firstName,String lastName)
	{
		
			
		return employeeList;
		
	}
	
	

}
