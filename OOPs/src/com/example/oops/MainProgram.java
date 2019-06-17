package com.example.oops;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public  class MainProgram 
{
	static HRService service = new HRService();
		public static void main(String[] args) 
		{
			
			
			while(true)
			{			
				System.out.println("Welcome to the HR SYSTEM");
				System.out.println("--------------------------------------------------");
				System.out.println("1)------Add the Employee---------------");
				System.out.println("2)------Remove the Employee-------------------");
				System.out.println("3)------Search the Employee--------------------------");
				System.out.println("4)------Search the Employee by FirstName and LastName--------------------------");
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
						
						System.out.println("Enter the role id");
						int roleId=sc.nextInt();
						System.out.println("Enter the role name");
						String roleName = sc.next();
						
						System.out.println("Enter the phone id");
						int phoneId =  sc.nextInt();
						System.out.println("Enter the areacode");
						String phoneAreaCode =  sc.next();
						System.out.println("Enter the countrycode");
						String countryCode = sc.next();
						System.out.println("Enter the number");
						String number = sc.next();
						
						System.out.println("Enter the address id");
						int addressId =  sc.nextInt();
						System.out.println("Enter the zip");
						String zip =  sc.next();
						System.out.println("Enter the country");
						String country =  sc.next();
						System.out.println("Enter the state");
						String state =  sc.next();
						System.out.println("Enter the city");
						String city =  sc.next();
						System.out.println("Enter the line1");
						String line1 =  sc.next();
						System.out.println("Enter the line2");
						String line2 =  sc.next();
						
							addEmployee(id,firstName,lastName,roleId,roleName,phoneId,phoneAreaCode,countryCode,number
									,addressId,zip,country,state,city,line1,line2);
							break;
						
					case 2:
						Scanner sc1 	= new Scanner(System.in);
						int id1 = sc1.nextInt();
							removeEmployee(id1);
							break;
					
					case 3:
						Scanner sc2 = new Scanner(System.in);
						System.out.println("Enter the id that needs to be searched");
						int id2 = sc2.nextInt();
							
							searchById(id2);
							
							break;
						
					case 4:

						System.out.println("Search the employee by the First Name and Last Name");
						Scanner sc3 = new Scanner(System.in);
						System.out.println("Enter the First Name of the Employee");
						String sfirstName = sc3.next();
						System.out.println("Enter the Last Name of the Employee");
						String slastName  = sc3.next();	
						searchByFirstAndLast(sfirstName,slastName);
						break;
					
					default :
						
							System.out.println("Invalid input");
					
				}
				
				
				
				
				}
		}
		
		public static void addEmployee(int id , String firstName, String lastName,
				int roleId,String roleName, int phoneId, String phoneAreaCode,String countryCode, String number
				,int addressId, String zip, String country, String state,String city, String line1, String line2) 
		{
			
			
			
			Role role = new Role(roleId,roleName);
			List<Role> roleList = new LinkedList<Role>();
			roleList.add(role);
			
			
			Phone phone = new Phone(phoneId,phoneAreaCode,countryCode,number);
			
			
			Address address = new Address(addressId,zip,country,state,city,line1,line2);
			
			
			Employee em =  new Employee(id, firstName, lastName);
			em.setRoles(roleList);
			em.setPhone(phone);
			em.setAddress(address);
			service.addEmployee(em);
			
			
		}
		
		public static void removeEmployee(int id1) 
		{
			
			service.removeEmployee(id1);
			
		}
		
		public static void searchById(int id2) 
		{
			
			if(service.search(id2)!=null)
				{
					service.search(id2);
					System.out.println(service.search(id2).toString());
				}
			else 
				{
					System.out.println("No employee found ... please modify the search parameters");
				}
		}
		
		public static void searchByFirstAndLast(String sfirstName, String slastName) 
		{	
			
			
			if(service.search(sfirstName,slastName)!=null)
			{
				service.search(sfirstName, slastName);
				System.out.println(service.search(sfirstName, slastName).toString());
			}
			else 
			{
				System.out.println("No employee found ... please modify the search parameters");
			}
		}
}

