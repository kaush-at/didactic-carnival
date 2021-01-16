package com.kaush.udmy.dsa2020;


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
		
		
		commonPrefix(arr1);
		commonPrefix(arr2);
		commonPrefix(arr3);
		commonPrefix(arr4);
		
	}
	
	
	// method - 1
	public static String commonPrefix(String[] arr) {
		String commonPrefix = "";
		
		for (int i = 0; i < arr.length; i++) {
			String picked = arr[0];
			char ch = picked.charAt(i);
			
			for (int j = 0; j < arr.length; j++) {
				
			}
		}
		
		System.out.println(commonPrefix);
		return commonPrefix;
		
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
