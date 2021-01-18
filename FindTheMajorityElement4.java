package com.kaush.udmy.dsa2020;

import java.util.Arrays;

// by sorting array and find the mid element
public class FindTheMajorityElement4 {

	public static void main(String[] args) {
	


		int[] arr1 = {1,2,2,1,3,1,1,2,3};
		int[] arr2 = {3,2,2,3,1,2,3,2,1};
		int[] arr3 = {3,2,3};
		int[] arr4 = {4,7,4,4,7,4,4,9,4,3};
		
		System.out.println(findMajorityElement(arr1));
		System.out.println(findMajorityElement(arr2));
		System.out.println(findMajorityElement(arr3));
		System.out.println(findMajorityElement(arr4));
	}
	

	public static int findMajorityElement(int[] arr) {
		
		Arrays.sort(arr);
		int mid = arr.length/2;
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[mid]== arr[i]) {
				count++;
			}
		}
		
		if(arr.length/2 < count) {
			return arr[mid];
		}else {
			return -1;
		}
	}
	
	


}
