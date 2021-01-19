package com.kaush.udmy.dsa2020;

import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(createFizzBuzz(3)));
		System.out.println(Arrays.toString(createFizzBuzz(15)));
		System.out.println(Arrays.toString(createFizzBuzz(5)));
	}
	
	public static String [] createFizzBuzz(int n) {
		String [] result = new String[n];
		int count = 0;
		
		for (int i = 1; i <= n; i++) {			
			if(i%3==0 && i%5==0) {
				result[count] = "FizzBuzz";
			}else if(i%3==0) {
				result[count] = "Fizz";
			}else if(i%5==0) {
				result[count] = "Buzz";
			}else {
				result[count] = String.valueOf(i);
			}
			
			count++;
		}
		
		return result;
	}

}
