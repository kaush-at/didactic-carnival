package com.kaush.udmy.dsa2020;


// moore's voting approach (intuition method)
public class FindTheMajorityElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3,1,1,2,3,1};
		int[] arr2 = {2,2,3,1,2,3,1};
		int[] arr3 = {3,2,3};
		int[] arr4 = {4,7,4,4,7,4,4,9,4,3};
		
		System.out.println(findMajorityElement(arr1));
		System.out.println(findMajorityElement(arr2));
		System.out.println(findMajorityElement(arr3));
		System.out.println(findMajorityElement(arr4));
	}
	
	public static int findMajorityElement(int[] arr) {
		int majority = arr[0];
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if(majority == arr[i]) {
				count++;
			}else {
				count--;
				if(count <= 0) {
					majority = arr[i];
					count=1;
				}
			}
		}
		
		
		return majority;
	}

}
