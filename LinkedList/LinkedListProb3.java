package com.algosample.java;

import java.util.Queue;

public class LinkedListProb3 {

	
	class Node{
		
		Node next;
		//Node prev;
		Node child;		
		Object data;
		
	}
	
	public Node header;
	public Node tail;
	
	public Queue q = (Queue<Object>) new LinkedList();
	
	public void listFlattening(Node head, Node tail)
	{
		header = head;
		this.tail = tail;
         
		Node current = head;
		while(current.next!=null)
		{
			
			if(current.child != null)
			{
				
				appendachild(current,tail);	
			
			}
			current = current.next;
		}		
	
	}
	
	public void  appendachild(Node current, Node tail)
	{
		
		Node temCurr = current;
		while(current.next!=null)
		{			
			
			current = current.next;
		}
		
		tail.next = temCurr;
		tail = current;
		
	}	
	
	
	
 
	
}
