package com.example.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingService {
	
	
	List<Employee> employeeList =  new LinkedList<Employee>();
	
	public List<Employee> addEmployee(List<Employee> employeeList)
	{
		
		this.employeeList = employeeList;
		return employeeList;
	}
	
	public void orderByAge(List<Employee> employeeList) 
	{
		Collections.sort(employeeList,new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				
				
				Integer x1 = ((Employee) o1).getAge();
				Integer x2 = ((Employee)o2).getAge();
				return x1.compareTo(x2);
				
			
			}
		});
	}
	public void orderByFirstName(List<Employee> employeeList) 
	{
		Collections.sort(employeeList,new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				String x1 = ((Employee) o1).getFirstName().toLowerCase();
				String x2 = ((Employee)o2).getFirstName().toLowerCase();
				int s1 =  x1.compareTo(x2);
				if(s1 != 0) 
				{
					return s1;
				}
				
				String x3 = ((Employee) o1).getLastName().toLowerCase();
				String x4 = ((Employee)o2).getLastName().toLowerCase();
				int s2 = x3.compareTo(x4);
				if(s2 !=0) 
				{
					return s2;
				}
				
				Integer x5 = ((Employee) o1).getAge();
				Integer x6 = ((Employee)o2).getAge();
				return x5.compareTo(x6);
				
			}
		});
	}
	
	public void orderByLastName(List<Employee> employeeList) 
	{
		Collections.sort(employeeList,new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				
				String x3 = ((Employee) o1).getLastName().toLowerCase();
				String x4 = ((Employee)o2).getLastName().toLowerCase();
				int s2 = x3.compareTo(x4);
				if(s2 !=0) 
				{
					return s2;
				}
				
				String x1 = ((Employee) o1).getFirstName().toLowerCase();
				String x2 = ((Employee)o2).getFirstName().toLowerCase();
				int s1 =  x1.compareTo(x2);
				if(s1 != 0) 
				{
					return s1;
				}
				
				
				
				Integer x5 = ((Employee) o1).getAge();
				Integer x6 = ((Employee)o2).getAge();
				return x5.compareTo(x6);
	
			}
		});
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	
	

}
