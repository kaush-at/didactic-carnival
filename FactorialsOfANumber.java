package com.sollers.java.basics;

import java.util.Scanner;

public class FactorialsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int result = 1;

		for (int i = 2; i <= number; i++) {
			result = result * i;
		}

		System.out.println("factorial for a number :  " + result);
	}

}
