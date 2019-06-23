package com.example.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args)
	{
		Employee em = new Employee(1,"Ram","Thapa",23);
		Employee em1 = new Employee(2,"Ram","Banjara",23);
		Employee em2 = new Employee(3,"Ram","Banjara",22);
		Employee em5 = new Employee(1,"Ram","Banjara",23);
		Employee em4 = new Employee(4,"Zib","aas",26);
		Employee em3 = new Employee(5,"Bib","Tas",26);
		Employee em6 = new Employee(5,"Bib","Banjara",26);
		
		List<Employee> employeeList = new LinkedList<Employee>();
		SortingService service = new SortingService();
		
		employeeList.add(em);
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		employeeList.add(em6);
		
		employeeList = service.addEmployee(employeeList);
		while(true)
		{	
			
			System.out.println("1. Sort By age");
			System.out.println("2. Sort By firstName");
			System.out.println("3. Sort By last Name");
			Scanner sc =  new Scanner(System.in);
			System.out.println("Make the selection : ");
			int opt = sc.nextInt();
			switch(opt) 
			{
			
			case 1:
				service.orderByAge(employeeList);
				for(Employee e : service.getEmployeeList()) 
				{
					System.out.println(e.age + ","+ e.firstName+","+e.lastName);
				}
				break;
			case 2:
				service.orderByFirstName(employeeList);
				for(Employee e : service.getEmployeeList()) 
				{
					System.out.println(e.age + ","+ e.firstName+","+e.lastName);
				}
				break;
			case 3:
				service.orderByLastName(employeeList);
				for(Employee e : service.getEmployeeList()) 
				{
					System.out.println(e.age + ","+ e.firstName+","+e.lastName);
				}
				break;
			default:
				System.out.println("Invalid selection");
			
			
			
			
			}
								
		}

	}
	
	}
