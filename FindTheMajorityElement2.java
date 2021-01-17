package com.kaush.udmy.dsa2020;

import java.util.HashMap;
import java.util.Map;

// using map
public class FindTheMajorityElement2 {

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
		int majority = arr[0];
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i])+1;
				map.put(arr[i], count);
			}else {
				map.put(arr[i], ++count);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if((arr.length/2) < entry.getValue() ) {
				return entry.getKey();
			}
		}
		
		return -1;
		
	}

}
