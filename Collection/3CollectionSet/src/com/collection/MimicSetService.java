package com.collection;

import java.util.ArrayList;
import java.util.List;

public class MimicSetService {
	
	List<Object> arrayList = new ArrayList<>();			
	int add(Object o) 
	{
		
		int check = 1 ;
		if(o == null) 
		{
			check = 0;                           
		}
		else {
		for (int i=0 ; i< arrayList.size() ; i++) 
		{
			
			
			if(!o.equals(arrayList.get(i))) 
			{
				check  = check * 1;
			}
			else 
			{
				check = check * 0 ;
			}
			}
		}
		if(check == 1)
		{
			arrayList.add(o);
			return arrayList.size()-1;
			
			
		}
		else 
		{
			System.out.println("It cannot be null");
			return -1;
		}
	
		
	}
	
	void remove (Object o) 
	{
		
		for(int i = 0 ; i < arrayList.size() ; i ++) 
		{ 
			if(o.equals(arrayList.get(i)))
			{
				arrayList.remove(i);
			}
			
		}
		
	}
	
	List<Object> showAll() 
	{
		System.out.println(arrayList);
		return arrayList;
	}
	
	public List<Object> getArrayList() {
		return arrayList;
	}
	
	
	

}
