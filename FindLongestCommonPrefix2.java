package com.kaush.udmy.dsa2020;

import java.util.Arrays;

/*
 * 	ex1/ ["abcdef","acdrft","axced"]  => "a"
 * 
 *  ex2/ ["flower","flow","flight"]  => "fl"
 * 
 *  ex3/ ["dog","pig","cat"] => ""
 *  
 *  ex4/ ["geeksforgeeks","geeks","geek", "geezer"] => "gee"
 * 
 */

public class FindLongestCommonPrefix2 {

	public static void main(String[] args) {
		
		String [] arr1 = {"abcdef","acdrft","axced"};
		String [] arr2 = {"flower","flow","flight"};
		String [] arr3 = {"dog","pig","cat"};
		String [] arr4 = {"geeksforgeeks","geeks","geek", "geezer"};
		
		
		System.out.println("longest common prefix of "+Arrays.toString(arr1)+" is => "+ commonPrefix(arr1));
		System.out.println("longest common prefix of "+Arrays.toString(arr2)+" is => "+ commonPrefix(arr2));
		System.out.println("longest common prefix of "+Arrays.toString(arr3)+" is => "+ commonPrefix(arr3));
		System.out.println("longest common prefix of "+Arrays.toString(arr4)+" is => "+ commonPrefix(arr4));
		
	}
	
	
	// method - 2 
	public static StringBuilder commonPrefix(String[] arr) {
		StringBuilder builder = new StringBuilder();
		
		// to validate array whether is empty or size is one
		if(arr.length == 0) {
			return builder;
		}else if(arr.length == 1) {
			return builder.append(arr[0]);
		}else {
			Arrays.sort(arr);
			// we  can get first string length
			for (int i = 0; i < arr[0].length(); i++) {
				if(arr[0].charAt(i) == arr[arr.length-1].charAt(i)) {
					builder.append(arr[0].charAt(i));
				}else {
					break;
				}
			}
		}
		
		
		return builder;
	}

	

}
