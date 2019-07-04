package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  
	static Map<Integer,String> phone = new HashMap<>();
     static List<String> result = new ArrayList<>();
       
    public List<String> letterCombinations(String digits) {
      
      
        if(digits == null || digits.equals(""))
        {
            return result;
        }
        
        phone.put(0,"");
        phone.put(1,"");
        phone.put(2,"abc");
        phone.put(3,"def");
        phone.put(4,"ghi");
        phone.put(5,"jkl");
        phone.put(6,"mno"); 
        phone.put(7,"pqrs");
        phone.put(8,"tuv");
        phone.put(9,"wxyz");
        
        
        StringBuilder sb = new StringBuilder();
        multiply(digits,sb);    
        System.out.println(result);
    return result;
        
    }

    public void multiply(String digits,StringBuilder sb)
    {
        
        if(sb.length() == digits.length())
        {
            result.add(sb.toString());
            return;
        }
      
       
        for (char c : phone.get(Character.getNumericValue(digits.charAt(sb.length()))).toCharArray())
        {
            sb.append(c);
            multiply(digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
      
    }


}