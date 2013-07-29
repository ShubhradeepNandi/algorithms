package com.algosample.java;

public class Queue {
	
	private Node Head;
	private Node Tail;
	private int N;
	
	class Node{		
	 Node next;
	 Object data;		
		
	}
	
	public int size(){
		return N;
	}
	
	public void enqueue(Object data){
		
		Node node = new Node();
		node.data = data;
		
		if(Tail!=null)
		{
			Tail.next.next = node;
			Tail.next = node;
			
		}else if(Head == null){
			Head.next = node;
			Tail.next = node;
		}
		
		N++;
	}
	
	public Node dequeue(){
		
		
		if(Head.next !=null)
		{
			
			if(Head.next.next ==null)
			{
			   Tail.next = null;
				
				Node temp = Head.next;
				Head.next = null;
				N--;
				return temp;
				
			}else{
				
				Node temp = Head.next;
				Head.next = temp.next;
				N--;
				return temp;
			}
			
			
			
		}
		
		return null;
	}
	
	
	

}
