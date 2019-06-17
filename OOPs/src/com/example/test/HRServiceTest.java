package com.example.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.example.oops.Address;
import com.example.oops.Company;
import com.example.oops.Contractor;
import com.example.oops.Employee;
import com.example.oops.FullTime;
import com.example.oops.HRService;
import com.example.oops.MainProgram;
import com.example.oops.Phone;
import com.example.oops.Role;

public class HRServiceTest {

	HRService service = new HRService();
	@Test
	public void testAddEmployee()
	{
		Employee employee = new Employee(1,"Ram","Thapa");
		Address address = new Address(1, "49504", "USA", "Michigan", "Grand Rapids", "1019", "Jackson");
		Phone phone = new Phone(1,"616","821","4079");
		Role role = new Role(1,"admin");
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(role);
		employee.setAddress(address);
		employee.setPhone(phone);
		employee.setRoles(roleList);
		
		HRService service = new HRService();
		service.addEmployee(employee);
						
	}
	
	@Test
	public void testAddNullEmployee()
	{
		Employee employee = null;
		HRService service = new HRService();
		service.addEmployee(employee);
						
	}
	
	
	@Test
	public void testremoveEmployee() 
	{
		Employee employee = new Employee(1,"Ram","Thapa");
		service.addEmployee(employee);
		service.removeEmployee(employee.getId());
	}
	
	@Test
	public void testsearchEmployee() 
	{
		Employee employee = new Employee(1,"Ram","Thapa");
		service.addEmployee(employee);
		service.search(employee.getId());
	}

	@Test
	public void testsearchEmployeeByFirstNameAndLastName() 
	{
		Employee employee = new Employee(1,"Ram","Thapa");
		service.addEmployee(employee);
		service.search("Ram","Thapa");
	}
	@Test
	public void testCompany() 
	{
		Employee employee = new Employee(1,"Ram","Thapa");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		Company company = new Company(1,"Versisk");
		company.setEmployeeList(employeeList);
		System.out.println(company.getEmployeeList());
		
	}
	
	@Test
	public void testContractor() 
	{
		Date date1 = new Date(2000, 12, 05);
		Date date2 = new Date(2001,12,9);
		Contractor contractor = new Contractor(date1,date2,12.999999f);
		
	}
	
	@Test
	public void testFullTime() 
	{
		Date date1 = new Date(2000, 12, 05);
		Date date2 = new Date(2001,12,9);
		FullTime fullTime = new FullTime(date1, 20000f, 150f);
		
		
	}
	
	@Test
	public void testMainClassAdd() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
	}
	
	@Test
	public void testMainClassRemove() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
		MainProgram.removeEmployee(1);
	}
	
	@Test
	public void testMainClassSearch() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
		MainProgram.searchById(1);
	}
	
	@Test
	public void testMainClassSearchEmployeeNotFound() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
		MainProgram.searchById(2);
	}
	
	@Test
	public void testMainClassSearchFirstAndLast() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
		MainProgram.searchByFirstAndLast("Bibek", "Thapa");
	}
	
	@Test
	public void testMainClassSearchFirstAndLastnull() 
	{
		
		MainProgram.addEmployee(1, "Bibek", "Thapa", 1, "admin", 1, "616", "821", "4072", 1, "49504", "USA", "MI", "Grand Roa", "line1", "line2");
		MainProgram.searchByFirstAndLast(null, "Thapa");
	}
}
