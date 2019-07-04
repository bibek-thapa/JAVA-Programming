package com.example;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
	
	
	static char c[] = new char[] {'a','b','c'};
	static char d[] = new char[] {'d','e','f'};
	static char e[] = new char[] {'g','h','i'};
	static String test = "abc";
	static StringBuilder sb = new StringBuilder();
	
	public static int[] swap(int a, int b) 
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		return new int[] {a,b};
	}

	public static void main(String[] args) {
	
		LinkedListMerge merge = new LinkedListMerge();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		System.out.println(merge.mergeTwoLists(l1, l2));
	}

}
