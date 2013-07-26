package com.algosample.java;

public class LinkedListProb4 {
	
	
	class Node{
		
		Node next;		
		Node child;
		Node prev;
        Object data;		
		
	}
	
	public Node head;
	public Node tail;
	
	public void unflatten(Node startNode)
	{
		head = startNode;
				
		explorePath(startNode);
		
		
		while(startNode.next != null)
		{
			startNode = startNode.next;
		}
		
       tail = startNode;		
		
	}
	
	
	public void explorePath(Node startNode)
	{
		
		Node current = startNode;
		
		while(current != null)
		{
			
			if(current.child != null)
			{				
				current.child.prev.next = null;
				current.child.prev = null;				
				explorePath(current.child);
				
			}
			
			current = current.next;
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
