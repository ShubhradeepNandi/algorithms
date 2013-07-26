package com.algosample.java;

import com.algosample.java.LinkedList.Node;



/**
 * 
 * Find the mth element from the end of a LinkedList.
 * 
 * 
 * 
 * @author Shubhradeep
 *
 */

public class LinkedListPorb2 {
	
	
	
	
	
	
	
	
	public Object mthNodeFromTail(Node head, int m)
	{
		Node mBehind = head;
		
        Node current = head;
        
        int count = 0;
		
		while(count < m)
		{
			
			if(current.next == null)
			{
				return null;
			}else
			{
				current = current.next;
				count++;
			}			
		}
		
		
		while(current.next !=null)
		{
			current = current.next;
			mBehind = mBehind.next;
			
		}
		
		
		return mBehind.data;
		
		
	}
	
	
	
	
	

}
