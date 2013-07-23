package com.algosample.java;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Shubhradeep
 *
 */
public class Stack implements Iterable<Object> {
	
	
	Node top = new Node();
	int N=0;
	
	
	class Node{		
	   Node next = null;
	   Object data = null;	
		
	}
	
	
	public boolean push(Object data)
	{
		Node n = new Node();
		n.data = data;
		n.next = top.next;
		top.next = n;
		N++;
		return true;
	}
	
	public Object pop(){
		
		Node popped = top.next;
		if(popped != null)
		top.next = popped.next;
		N--;
		return popped.data;
	}
	
	public Object peek(){
		
		return top.next != null? top.next.data:null;
		
	}
	
	
	
	
	
	public int size()
	{
		
		return N;
	}

	@Override
	public Iterator<Object> iterator() {
		return new LinkListIterator();
	}
	
	
	
	private class LinkListIterator implements ListIterator<Object>
	{
		
        public Node current = top; 		
        public int index = 0;

		@Override
		public void add(Object e) {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public boolean hasNext() {
			if(top.next != null)
			   return true;
			return false;
		}

		@Override
		public boolean hasPrevious() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public Object next() {
			
			if(!hasNext())
			{
				throw new NoSuchElementException();
			}
			
			Object data = current.data;
			current = current.next;
			index++;
			return data;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return index;
		}

		@Override
		public Object previous() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public int previousIndex() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public void set(Object e) {
			throw new UnsupportedOperationException();
			
		}
		
	}
	
	
	
	

}
