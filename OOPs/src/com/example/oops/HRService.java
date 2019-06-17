package com.example.oops;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HRService
{

//	List<Employee> employeeList = new LinkedList<Employee>();
	
	Map<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();
	public void addEmployee(Employee e) 
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

	public int removeEmployee(int id) 
	{
		
		employeeMap.remove(id);
		System.out.println("Employee succesfully removed");
		
		return 1;
		
	}
	
	public Employee search(int id) 
	{
		Employee em = employeeMap.get(id);	
		System.out.println("Employee with " + id +" is succesfully searched");
		return em;					
		
	}

	public List<Employee> search(String firstName,String lastName)
	{
		List<Employee> employeeList= new LinkedList<Employee>();
		for(Entry<Integer,Employee> entry : employeeMap.entrySet()) 
		{
			System.out.println(entry.getValue().firstName);
			if(entry.getValue().firstName.equals(firstName) && entry.getValue().lastName.equals(lastName)) 
			{
				employeeList.add(entry.getValue());
			}
		}

		System.out.println("The employees are succesfully searched");
		return employeeList;
		
	}
	
	

}
