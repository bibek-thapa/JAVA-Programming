package com.example;

import java.util.HashSet;
import java.util.Set;

class Longest {
    public int lengthOfLongestSubstring(String s) {
        
       if(s == null || s.equals("") || s.length() == 0)
       {
           return 0;
       }
        
      Set<Character> setList = new HashSet<>();
     
      int right =  0 ; 
      int left  = 0 ;
      int max = 0;
      while(right < s.length()) 
      {
    	  if(setList.add(s.charAt(right))) 
    	  {
    		  right++;
    		  max = Math.max(max , right-left);
    	  }
    	  
    	  else 
    	  {
    		  setList.remove(s.charAt(left++));
    	  }
      }
      
      
        
       
        
         
 
    return max;
    }
}