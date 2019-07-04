package com.example;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LinkedListMerge {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {   
    ListNode pointer1 = l1;
    ListNode pointer2 = l2;
        
    ListNode result = new ListNode(0);
    ListNode pointerResult = result;
    
    int test = 0;    
    while( pointer1!=null || pointer2!=null)
    {
        pointerResult.next = new ListNode(0);
        pointerResult = pointerResult.next;
    	 if(pointer1 != null)
         {
              test = test + pointer1.val;
              pointer1 = pointer1.next;
              pointerResult.val = test;
              test =test  * 0 ;
              pointerResult = pointerResult.next;
         }    	 
        if(pointer2 !=null)
        {
            test = test + pointer2.val;
            pointer2 = pointer2.next;
            pointerResult.val = test;
            test = test * 0;
            pointerResult = pointerResult.next;                     
        }          
    }            
    return result;            
}}