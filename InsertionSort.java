package com.kaush.test;

import java.util.Arrays;

public class InsertionSort {

	

	
	public static void main(String [] args) {
		
		int[] arr = { 2, 4, 7, 3, 7, 4, 9, 4 };
		
		int [] result = insertionSort(arr);
		
		System.out.println("result array " + Arrays.toString(result));
	}
	
	public static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int k;
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				k = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = k;
				j--;
			}
		}
		return arr;
	}
	
	
}
