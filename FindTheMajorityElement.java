package com.kaush.udmy.dsa2020;


// moore's voting approach (intuition method)
public class FindTheMajorityElement {

	public static void main(String[] args) {
	
/*
 * 		these two input dosent work  for this algorithm because there are no majority element here
 * 
 * 		int[] arr1 = {1,2,2,1,3,1,1,2,3};
 *		int[] arr2 = {3,2,2,3,1,2,3,2,1};
 *		
 *		we have to validate idf we cannot do above assumption
 * 
 */

		int[] arr1 = {1,2,2,1,3,1,1,2,3};
		int[] arr2 = {3,2,2,3,1,2,3,2,1};
		int[] arr3 = {3,2,3};
		int[] arr4 = {4,7,4,4,7,4,4,9,4,3};
		
		System.out.println(findMajorityElement(arr1));
		System.out.println(findMajorityElement(arr2));
		System.out.println(findMajorityElement(arr3));
		System.out.println(findMajorityElement(arr4));
	}
	
	// to do this at least one majority element should present
	public static int findMajorityElement(int[] arr) {
		int majority = arr[0];
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] == majority) {
				count++;
			}else {
				count--;
				if(count == 0) {
					majority = arr[i];
					count=1;
				}
			}
		}
		
		// if we cannot assume the majority element always there
		   int majorityCount = 0;
		   for (int i = 0; i < arr.length; i++) {
			if(arr[i] == majority) {
				majorityCount++;
			 }
		   }
		
		   if(majorityCount > arr.length/2) {
			   return majority;
		   }else {
			   return -1;
		   }

		
	}
	
	


}
