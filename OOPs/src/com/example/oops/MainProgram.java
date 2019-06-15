package com.example.oops;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public final class MainProgram {

	public static void main(String[] args) {
		HRService service = new HRService();
		while(true) {
		
		System.out.println("Welcome to the HR SYSTEM");
		System.out.println("--------------------------------------------------");
		System.out.println("1)------Add the Employee---------------");
		System.out.println("2)------Remove the Employee-------------------");
		System.out.println("3)------Search the Employee--------------------------");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		
		switch(n) 
		{
		
		case 1 :
			
			Scanner sc 	= new Scanner(System.in);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the firstName");
			String firstName = sc.next();
			System.out.println("Enter the lastName");
			String lastName = sc.next();
			System.out.println("Enter the role");
			int roleId=sc.nextInt();
			System.out.println("Enter the role name");
			String roleName = sc.next();
			Role role = new Role(roleId,roleName);
			List<Role> roleList = new LinkedList<Role>();
			roleList.add(role);
			Employee em =  new Employee(id, firstName, lastName);
			em.setRoles(roleList);
			service.addEmployee(em);
			
			break;
			
		case 2:
			Scanner sc1 	= new Scanner(System.in);
			int id1 = sc1.nextInt();
			service.removeEmployee(id1);
			
			break;
		
		case 3:
			Scanner sc2 = new Scanner(System.in);
			int id2 = sc2.nextInt();
			Employee searchEmployee = service.search(id2-1);
			System.out.println(searchEmployee.firstName);
			List<Role> roleList1 = new LinkedList<Role>();
			roleList1=searchEmployee.getRoles();
			System.out.println(roleList1.get(0).name);
			break;
			
		case 4:
			
		default :
			System.out.println("Invalid input");
		
		}
		
		
		
		
		}
	}
}

