package com.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
	
	List<Person> personList = new ArrayList<>();
	Map<Float,Person> personMap = new HashMap<>();
	
	public List<Person> generateList()
	{
		personList.add(PersonFixture.person1());
		personList.add(PersonFixture.person2());
		personList.add(PersonFixture.person3());
		personList.add(PersonFixture.person4());
		personList.add(PersonFixture.person5());
		personList.add(PersonFixture.person6());
		personList.add(PersonFixture.person7());
		personList.add(PersonFixture.person8());
		personList.add(PersonFixture.person9());
		return personList;
	}
	
	public Map<Float,Person> transform (List<Person> people)
	{
						
		for(int i = 0 ; i < people.size() ; i ++) 
		{
			if(!personMap.containsKey((float)people.get(i).getId()))
			{	
				personMap.put((float)people.get(i).getId(),people.get(i));
				
			int count = 0 ;
			String res = "";
			for(int j = i+1 ; j < people.size() ; j++) 
			{
				
				
				if(people.get(i).getId() == people.get(j).getId()) 
				{
					if(count == 0) {
					 res = res + people.get(j).getId()+".1";
					}
					else 
					{
						res = res + "1";
					}
					 personMap.put(Float.parseFloat(res),people.get(j));
					count = count +1 ; 
				}
			}
		}
		}
		System.out.println(personMap);
		
		return personMap;
	}
	

	public List<Person> show() {
		
		return personList;
	}
	
	
	public Map<Float,Person> showMap()
	{
		
		return personMap;
	}
	
}
