package com.algosample.java;

public class BinarySearch{
	
	int[] arr;
	public BinarySearch(int[] arr)
	{
		this.arr = arr;
	}
	
	
	
	public boolean binarySearchRecursive(int n, int first, int last)
	{
		
		int middle = (first + last)/2;
		
		if(n < arr[middle])
		{			
			binarySearchRecursive(n,first,middle-1);
		}
		else if(n > arr[middle])
		{
			binarySearchRecursive(n,middle+1,last);
			
		}else{
			
			return true;
		}
		
		
		return true;
		
	}
	
	
	public boolean binarySearchNonRecursive(int n)
	{
		int start = 0;
		int end = arr.length -1;
		
		while(start < end)
		{
			int midIndex = (start + end)/2;
			if(n < arr[midIndex])
			{
				end = midIndex - 1;
				
			}else if(n > arr[midIndex]){
				
				start = midIndex + 1;
			}else{
				
				return true;
			}
			
			
		}
		
		return false;
		
		
	}
	
	
	
	
	
	
	

}
