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

public class FindLongestCommonPrefix {

	public static void main(String[] args) {
		
		String [] arr1 = {"abcdef","acdrft","axced"};
		String [] arr2 = {"flower","flow","flight"};
		String [] arr3 = {"dog","pig","cat"};
		String [] arr4 = {"geeksforgeeks","geeks","geek", "geezer"};
		
		
		System.out.println(commonPrefix(arr1));
		System.out.println(commonPrefix(arr2));
		System.out.println(commonPrefix(arr3));
		System.out.println(commonPrefix(arr4));
		
	}
	
	
	// method - 1 
	public static StringBuilder commonPrefix(String[] arr) {
		StringBuilder builder = new StringBuilder();
		
		// to validate arr whether is empty or not
		if(arr.length == 0) {
			return builder;
		}
		
		String minString = findMinString(arr);
		
		for (int i = 0; i < minString.length(); i++) {
			char ch = minString.charAt(i);
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].charAt(i) != ch) {
					return builder;
				}
			}
			
			builder.append(ch);
			
		}
		
		return builder;
		
	}

	
	// finding the minimum size string in a array
	public static String findMinString(String [] arr) {
		String minString="";
		
		minString = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].length() < minString.length()) {
				minString = arr[i];
			}
		}
		
		return minString;
		
	}
}
