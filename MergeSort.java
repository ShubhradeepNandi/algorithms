package com.algosample.java;

public class MergeSort extends BigOExamples {
	
	int arr[];
	public MergeSort(int arr[]){
		
		this.arr =arr; 
		
	}
	
	public void merge_sort( int first, int last)
	{
		while(first < last)
		{
			int middle = (first + last)/2;
			merge_sort(first, middle);
			merge_sort(middle + 1, last);
			merge(first,middle,last);
			
		}
	}
	
   public void merge(int first,int middle,int last)
   {
	   int i = first;
	   int j = middle;
	   int k = 0;
	   int temp[] = new int[last - first + 1];
	   while(i<=middle && j < last)
	   {
		   if(arr[i] <= arr[j])
		   {
			   temp[k++] = arr[i++];
			   		   
		   }else{
			   
			   temp[k++] = arr[j++];
			   
		   }
		   
		   while(arr[i] < middle){ temp[k++] = arr[i++];}
		   while(arr[j] < last){ temp[k++] = arr[j++];}
		   
		   for(k=0; k<temp.length; k++){ arr[k+first]= temp[k];}
		   
	   }
	   
	   
	   
   }
	
	
	
	
	
	
	

}
