package com.algosample.java;
/**
 * 
 * @author Shubhradeep
 *
 */

public class LinkedList {
    public Node header = null;
	
    /*
     * Add a new Node
     */
	public void add(Object n)
	{
		Node node =new Node(n);
		if(header != null)
		{
			Node temp = header;
			header = node;
			node.next = temp;
			
			
		}else{
			header = node;
		}
		
	}
	
	/**
	 * Remove an existing data
	 * @param data
	 */
public void remove(Object data)
{
   Node node = header;
	while(node.next!= null)
	{
		if(header.next.data.equals(data))
		{
			
			node.next = node.next.next;
		}else{
			
			node = node.next;
			
		}		
		
	}
}	
	/*
	 * Get the Size of data
	 */
	public int size(){
		int count = 0;
		Node n = header;
		while(n != null)
		{
			n = n.next;
			count++;
			
		}
		
		return count;
		
	}
	
	/**
	 * Check if an Object is present
	 * @param data
	 * @return
	 */
	public boolean find(Object data)
	{
		Node n = header;
		while(n != null){
			
			if(n.data.equals(data))
			{
				return true;
			}
			
			n=n.next;
			
		}
		
		return false;
		
		
	}
	
	/**
	 * Get the previous element
	 * @param data
	 * @return
	 */
	public Object findPrevious(Object data)
	{
		Node n = header;
		if(n==null){return null;}
		while(n.next != null){
			
			if(n.next.data.equals(data))
			{
				return n;
			}
			
			n=n.next;
			
		}
		
		return null;
		
		
	}
	
		
	class Node{
		
		Node next = null;
		Object data = null;
		
		public Node(Object n){
			data = n;
						
		}
		
		public Node(Object o, Node n){
			next = n;
			data = o;
						
		}
		
		
	}
	
	
}
