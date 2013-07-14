package com.algosample.java;

import java.util.ArrayList;
import java.util.List;

public class BigOExamples {
	
	
	//O(1)
	//To check a number is positive
	public boolean bigOofOne(int n)
	{
		if(n>1) return true;
		return false;
		
		
	}
	
	//O(log n)
	//Binary Search
	public boolean bigOlogarthmic(ArrayList<Integer> listOfValues,int n)
	{
		int startIndex = 0;
		int endIndex = listOfValues.size();
		
		while(startIndex < endIndex)
		{
			int midIndex = ((endIndex - startIndex)/2) + startIndex;
			int midKey = listOfValues.get(midIndex);
			
			if(n > midKey)
			{
				startIndex = midIndex + 1;
			}else if(n < midKey)
			{
				endIndex= midIndex - 1;
			}else{
				return true;				
			}			
		}		
		return false;		
	}
	
		
	//O(n) 
	//Finding the Max element in an Array
	public int bigOn(ArrayList<Integer> listOfValues)
	{
		int mxElem = 0;
		
		for(Integer intVal:listOfValues)
		{			
			if(intVal > mxElem)
				mxElem = intVal;			
		}
		
		return mxElem;
		
	}
	
	//O(n log n) && n^2
	//Quick Sort Best Average is O(nlogn) and worst case is O(n^2)
	private class quickSort{
		
		
		
		public List<Integer> quikSrt(ArrayList<Integer> listOfInteger, int first, int last)
		{
			int pivotIndex;
			int partitionpivot;
			
			while(first < last)
			{
			  partitionpivot = (int)(Math.random()*(last - first)+first);
			  pivotIndex = partitionAlgo(listOfInteger, first, last,partitionpivot);
			  quikSrt(listOfInteger, first, pivotIndex -1);
			  quikSrt(listOfInteger, pivotIndex + 1, last);
			  
			}
			
			return listOfInteger;
			
		}
		
		
		
		private int partitionAlgo(ArrayList<Integer> listOfInteger, int first, int last,int partitionpivot)
		{

			int pivot = listOfInteger.get(partitionpivot);			
			swap(listOfInteger,partitionpivot,last);
			int index = first;
			for(int i = first; i<last; i++)
			{
				if(listOfInteger.get(i) <= pivot)
				{
					swap(listOfInteger,i,index);
					index++;					
				}
			}
			
			swap(listOfInteger,last, index);
			return index;
			
			
			
			
			
		}
		
		private void swap(ArrayList<Integer> listOfInteger,int up, int down)
		{
			//System.out.println("Swapping "+ listOfInteger.get(up)+ " and " + listOfInteger.get(down));
			int a = listOfInteger.get(up);
			int b = listOfInteger.get(down);
			listOfInteger.remove(up);
			listOfInteger.add(up, b) ;
			listOfInteger.remove(down);
			listOfInteger.add(down, a) ;
			
		}
	
		
	}
	
	//O(nlogn)
	private class mergeSort{
		
		int arr[] = new int[]{4,3,2,1};
		
		public void mergeSort(int left, int right)
		{
			if(left < right){
			  int mid = (left + right)/2 ;
			  mergeSort(left, mid);
			  mergeSort(mid + 1, right);
			  merge(left,mid,right);
			}
			
		}	
			
		
	    public void merge(int first, int mid, int last) {
	    	int temp[] = new int[last - first + 1];
	    			int i = first;
	    			int j = mid + 1;
	    			int k = 0;
	    		    while( i <= mid && j <= last)
	    		     if( arr[i] <= arr[j] )
	    		      {
	    		        temp[k++] = arr[i++];
	    		      }	else{
	    		      temp[k++] = arr[j++];         
	    			  }	  
	    		     while( j <= last){ temp[k++] = arr[j++]; } //copy the rest from right
	    			 while(i <= mid){ temp[k++] = arr[i++]; } //copy the rest from left
	    			 for(k = 0; k<temp.length; k++) {arr[k + first] = temp[k];}
	    }
		
		
	}	

}
