package com.tnsif.Day_11.v1;

public class ArrayOperations {

	int intArray[] ;
	
	public ArrayOperations() {
		super();
		
	}

	public ArrayOperations(int[] intArray) {
		super();
		this.intArray = intArray;
		
	}
	
	public void displayArray() {
		for(int no:intArray) {
			System.out.println("The array elements are: "+no);
		}
	}
	
	public int getElement1
	
	(int position) {
		return intArray[position];
	}

	public String getElement(int position) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
