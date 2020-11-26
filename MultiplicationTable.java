package com.sollers.java.basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		multiplicationTable(number);
	}

	public static void multiplicationTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}

}
