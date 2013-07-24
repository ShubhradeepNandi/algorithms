package com.algosample.java;

import java.util.Iterator;
import java.util.ListIterator;
/**
 * 
 * @author Shubhradeep
 * 
 * 
 * Head and Tail are global Pointers to the first and last element in a LL to determine head and tail at O(1) complexity.
 * Create a methods in LL as delete(Element) from the List
 * Create a method insertAfter(AfterElement, ElementToInsert)
 * 
 *
 */

public class LinkedListProb1 implements Iterable<Object>{
	
   private class Node{
	   
	   Node next;
	   Object data;
	   
   }
	
	public int N;
	public Node head;
	public Node tail;
	
	//O(1)
	public Object getHead(){
		
		return head.next != tail?head.next.data:null;
	}

	//O(1)
	public Object getTail(){
		
		return tail.next != head?tail.next.data:null;
	}
	
	
	public int size(){
		
		return N;		
	}
	
	
	public void add(Object data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = tail;
		Node oldLast = tail.next;
		oldLast.next = newNode;
		tail.next = newNode;
		N++;		
	}
	
	
	
	public LinkedListProb1()
	{
		head = new Node();
		tail = new Node();
		
		head.next = tail;
		tail.next = head;		
		
	}
	
	
	
	//O(n)
	public boolean Delete(Object obj){
		
		Node current = head;
		while(current.next != tail && current.next !=null)
		{
			if(current.next.data.equals(obj))
			{
				if(current.next.next == tail)
				{
					tail.next = current;
				}
				current.next = current.next.next;
				return true;
				
			}
			
			
		}		
		
      return false;		
		
	}
	
	
	
	public boolean InsertAfter(Object insertAfter, Object data )
	{
		Node current = head;
		
		while(current.next != tail && !current.next.data.equals(insertAfter) )
		{
			
			if(current.next.data.equals(insertAfter))
			{
				Node tempCurrent = current.next;
								
				Node newNode = new Node();
				newNode.data = data;
				newNode.next = tempCurrent;
				
				tempCurrent.next = newNode;
				
				if(tail.next == tempCurrent )
				{
					tail.next = newNode;
					
				}
				
				return true;
				
			}
		}
		
		
      return false;		
		
	}




	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListProbIter();
	}
	
	
	
	private class LinkedListProbIter implements ListIterator<Object>{

		private Node current = head;
		private int index;
		
		@Override
		public boolean hasNext() {
			
			return index < N;
		}

		@Override
		public Object next() {			
			
			if(current.next != tail)
			{
				current = current.next;
				
				index++;
				return current.data;
			}
			
			return null;
		}

		@Override
		public void remove() {
			
			if(current != head || current != tail)
			{
				Node start = head;
				
				while(start.next != tail)
				{
					if(start.next.next == current)
					{
						Node hold = start.next;
						hold.next = current.next;
						if(hold.next != tail)
						{
						current = hold.next;
						}else{
						  current = hold;
						}
						index++;
						N--;
						return;
					}
				}
				
			}
			
		}

		@Override
		public void add(Object e) {
			
			if(current!=tail)
			{
				Node newNode = new Node();
				newNode.next = current.next;
				newNode.data = e;
				current.next = newNode;
				N++;
				index++;
			}
			
			
		}

		@Override
		public boolean hasPrevious() {
			return current != head;
		}

		@Override
		public int nextIndex() {			
			return index++;
		}

		@Override
		public Object previous() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public int previousIndex() {			
			return index-1;
		}

		@Override
		public void set(Object e) {
			throw new UnsupportedOperationException();
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
