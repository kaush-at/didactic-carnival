package com.kaush.test.dsa;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number you need to reverse :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		reverseNumberUsingForLoop(number);
		reverseNumberUsingDoWhileLoop(number);
		reverseNumberUsingWhileLoop(number);
	}




	private static void reverseNumberUsingForLoop(int number) {
		int reversedNumber = 0;
		
		for (int i = number; i > 0; i /= 10) {
			int remainder = i % 10;
			reversedNumber = reversedNumber*10 + remainder;
		}
		
		System.out.println("Reversed number using for loop : "+ reversedNumber);
	}

	private static void reverseNumberUsingDoWhileLoop(int number) {
		int reversedNumber = 0;
		do {
			int remainder	 = number % 10;
			reversedNumber = reversedNumber*10 + remainder;
			number /= 10;
		}
		while(number > 0);
		
		System.out.println("Reversed number using do-while loop : "+ reversedNumber);
	}
	
	
	private static void reverseNumberUsingWhileLoop(int number) {
		int reversedNumber = 0;
		
		while(number > 0) {
			int remainder = number % 10;
			reversedNumber = reversedNumber*10 + remainder;
			number /= 10;
		}
		System.out.println("Reversed number using while loop : "+ reversedNumber);
		
	}
	
	
}
