package com.algosample.java;

import java.util.ArrayList;

public class QuickSort {
	
	
	
	
	public void Quick_Sort(ArrayList<Integer> listOfInteger, int first, int last)
	{
       int pivotIndex;
       int partitionIndex;
	
       while(first < last){
    	   partitionIndex = (int)Math.random()*(last - first) + first;
    	   pivotIndex = parition(listOfInteger,first,last,partitionIndex);
    	   Quick_Sort(listOfInteger,first,pivotIndex-1);
    	   Quick_Sort(listOfInteger,pivotIndex+1,last);    	   
       }
		
	}
	
	
	public int parition(ArrayList<Integer> listOfInteger,int first,int last,int partitionIndex)
	{
		int pivotValue = listOfInteger.get(partitionIndex);
		swap(listOfInteger,partitionIndex,last);
		int index =0;
		for(int i=first; i<last; i++)
		{
			if(listOfInteger.get(i)<=pivotValue)
			{
				swap(listOfInteger,i,index);
				index++;
			}
			
		}
		
		swap(listOfInteger,last,index);
		return index;
	}
	
	public void swap(ArrayList<Integer> listOfInteger,int first,int second){
		
		int a = listOfInteger.get(first);
		listOfInteger.set(first,listOfInteger.get(second));
		listOfInteger.set(second,a);
		
		
	}
	
	

}
