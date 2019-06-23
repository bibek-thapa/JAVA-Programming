package com.example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args)
	{
		List<Object> arrayList = Arrays.asList("One",2,"Three",67.986,"Z", "ABC",123,true, "xyz");
		String i = "";
		while(!i.equals("#")) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter the element");
		String element = scanner.next();
		if(element.equals("#")) 
		{
			i = "#";
			break;
		}
		System.out.println("Enter the desired location which is between 1 to 5");
		int pos = scanner.nextInt();
		
		if(pos > 1 && pos <5) {
			
			
			
			if(element.equals("true") || element.equals("false")){
				Boolean res =  Boolean.parseBoolean(element);
				arrayList.set(pos-1, !res);
				
			}
			
			
			else if (element.matches("^\\d+$")) 
			{
				Integer res = Integer.parseInt(element);
				arrayList.set(pos-1, res+1);
			}
			
			else if(element.matches("^(?:[1-9]\\d*|0)?(?:\\.\\d+)?$")) 
			{
				Float res = Float.parseFloat(element);
				arrayList.set(pos-1, res+2.0);
			}
			
			else if(element.matches("[A-Z a-z]"))
			{
				char res = element.charAt(0);
				arrayList.set(pos-1, (char)(element.charAt(0)+1));
			}
			
			else 
			{
				if(element.matches("[A-Z]+")) 
				{
					arrayList.set(pos-1, element.toLowerCase());
				}
				else 
				{
					arrayList.set(pos-1, element.toUpperCase());
				}
			}
		
		
		}
		else 
		{
			System.out.println("Please try again. Enter the location between 1 to 5");
			
		}
		
		System.out.println(arrayList);
		
		}

	}

}
