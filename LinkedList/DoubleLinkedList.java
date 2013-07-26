package com.algosample.java;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList implements Iterable<Object> {


	private int N;        //number of elements in the list
	private Node pre;     //pointer before the first element
	private Node post;    //pointer after the last element
	
	public DoubleLinkedList(){
		
		pre = new Node();
		post = new Node();
		
		pre.next = post;
		post.prev = pre;
		
		
	}
	
	public int size(){ return N;}
	
	public boolean isEmpty(){ return N==0;}
	
	public void add(Object obj)
	{
		Node node = new Node();
		Node last = post.prev;
		
		node.data = obj;
		node.next = post;
		node.prev = last;
		post.prev = node;
		last.next = node;
		N++;
	
	}
	
	
private class Node
{
	
	Node next = null;
	Object data = null;
	Node prev = null;
	
}

@Override
public Iterator<Object> iterator() {
	
	return null;
}
	
	
private class doubleLinkedListIterator implements ListIterator{
	
	private Node current = pre.next;
	private Node lastAccessed = null;
	
	
	private int index = 0;

	@Override
	public void add(Object e) {
		Node n = new Node();
		n.data = e;
		Node x = current.prev;
		Node y = current;
		x.next = n;
		n.prev = x;
		n.next = y;
		y.prev = n;
		
       N++;
       index++;
       lastAccessed = null;
		
	}

	@Override
	public boolean hasNext() {
		return index < N;
	}

	@Override
	public boolean hasPrevious() {
		
		return index > 0;
	}

	@Override
	public Object next() {
		if(!hasNext()) throw new NoSuchElementException();
		lastAccessed = current;
		Object data = current.data;
		current = current.next;
		index++;
		return data;
	}

	@Override
	public int nextIndex() {
		
		return index;
	}

	@Override
	public Object previous() {
		
		if(!hasPrevious()) throw new NoSuchElementException();
		lastAccessed = current.prev;
		Object data = lastAccessed.data;
		current = current.prev;
		index--;
		return data;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return index - 1;
	}

	@Override
	public void remove() {
		Node a = lastAccessed.prev;
		Node b = lastAccessed.next;
		a.next = b;
		b.prev = a;
		N--;
		if(current == lastAccessed)
		{
			current = b;
		}else{
			index --;
			lastAccessed = null;
			
		}
		
	}

	@Override
	public void set(Object e) {
		// TODO Auto-generated method stub
		if(lastAccessed == null) throw new NoSuchElementException();		
		lastAccessed.data = e;
	}
	
	
	
	
	
	
	
	
}

	
}
