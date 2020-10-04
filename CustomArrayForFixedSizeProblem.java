package com.collections.arrays.custom;

public class CustomArrayForFixedSizeProblem {

	public Object[] arr;
	int index = 0;
	
	public CustomArrayForFixedSizeProblem(int size) {
		this.arr = new Object[size];
	}
	
	public void add(Object element) {
		if((arr.length - 1) == index) {
			increaseCapacity();
		}
		
		arr[this.index] = element;
		this.index++;
	}
	
	// create a double size array
	public void increaseCapacity() {
		Object[] newArr = new Object[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
	}
	
	// get Array details
	public String getArrayCapacityAndSize() {
		int ArrSize = index + 1;
		return "capacity of the Array is : "+ arr.length + " and size of array is : "+ ArrSize;
	}
}
