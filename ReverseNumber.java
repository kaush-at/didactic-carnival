package com.kaush.test.dsa;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number you need to reverse :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		reverseNumberUsingForLoop(number);
	}

	private static void reverseNumberUsingForLoop(int number) {
		int reversedNumber = 0;
		
		for (int i = number; i > 0; i /= 10) {
			int remainder = i % 10;
			reversedNumber = reversedNumber*10 + remainder;
		}
		
		System.out.println("Reversed number using for loop : "+ reversedNumber);
	}

}
