package com.person.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.person.Person;
import com.person.PersonFixture;
import com.person.PersonService;

public class PersonServiceTest {

	List<Person> personList = new ArrayList<>();
	
	
	
	
	@Test
	public void testGenerateList() {
		
		PersonService personService =  new PersonService();
		personList = personService.generateList();
		assertEquals(9, personList.size());
		assertEquals("Ram", personList.get(0).getName());
		
	}
	
	@Test
	public void testTransform() {
		
		Map<Float,Person> personMap = new HashMap<>();
		PersonService personService =  new PersonService();
		personList=personService.generateList();
		personMap =  personService.transform(personList);
		  
		assertEquals("Ram", personMap.get(1.0f).getName());
		assertEquals("Hari", personMap.get(1.1f).getName());
		assertEquals("Prem", personMap.get(1.11f).getName());
	}
	
	@Test
	public void showMap() 
	{
		Map<Float,Person> personMap = new HashMap<>();
		PersonService personService =  new PersonService();
		personList=personService.generateList();
		personMap =  personService.transform(personList);
		System.out.println("Key"+"   "+ "First Name");
		for(Entry me : personMap.entrySet()) 
		{
			Person person = personMap.get(me.getKey());
			String firstName = person.getName();
			System.out.println(me.getKey()+"   "+ firstName);
		}	
	}
	

}
