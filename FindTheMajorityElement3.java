package com.kaush.udmy.dsa2020;

import java.util.HashMap;
import java.util.Map;

// using two for loops
public class FindTheMajorityElement3 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3,1,1,2,3,1};
		int[] arr2 = {3,2,2,3,1,2,3,2,1};
		int[] arr3 = {3,2,3};
		int[] arr4 = {4,7,4,4,7,4,4,9,4,3};
		
		System.out.println(findMajorityElement(arr1));
		System.out.println(findMajorityElement(arr2));
		System.out.println(findMajorityElement(arr3));
		System.out.println(findMajorityElement(arr4));
	}
	
	public static int findMajorityElement(int[] arr) {
		
		int index = -1;
		int maxCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]== arr[j]) {
					count++;
				}
			}
			
			if(maxCount < count) {
				maxCount = count;
				index = i;
			}
		}
		
		if(maxCount >= arr.length/2) {
			return arr[index];
		}else {
			return 0;
		}
	}
	

}
