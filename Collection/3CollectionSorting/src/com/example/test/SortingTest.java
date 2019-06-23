package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.sorting.Employee;
import com.example.sorting.SortingService;

class SortingTest {

	Employee em = new Employee(1,"Ram","Thapa",23);
	Employee em1 = new Employee(2,"Ram","Banjara",23);
	Employee em2 = new Employee(3,"Ram","Banjara",22);
	Employee em5 = new Employee(1,"Ram","Banjara",23);
	Employee em4 = new Employee(4,"Zib","aas",26);
	Employee em3 = new Employee(5,"Bib","Tas",26);
	Employee em6 = new Employee(5,"Bib","Banjara",26);
	
	List<Employee> employeeList =  new LinkedList<Employee>();
	SortingService service = new SortingService();
	
	
	@Test
	void testOrderByAge() {
		employeeList.add(em);
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		employeeList.add(em6);
		service.addEmployee(employeeList);
		
		service.orderByAge(employeeList);
		System.out.println(employeeList);
		assertEquals(22,service.getEmployeeList().get(0).getAge());
	}
	

	@Test
	void testOrderByFirstName() {
		employeeList.add(em);
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		employeeList.add(em6);
		service.addEmployee(employeeList);
		
		service.orderByFirstName(employeeList);
		System.out.println(employeeList);
		assertEquals("Bib",service.getEmployeeList().get(0).getFirstName());
	}


	@Test
	void testOrderByLastName() {
		employeeList.add(em);
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		employeeList.add(em6);
		service.addEmployee(employeeList);
		
		service.orderByLastName(employeeList);
		System.out.println(employeeList);
		assertEquals("aas",service.getEmployeeList().get(0).getLastName());
	}
}
