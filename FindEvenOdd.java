package com.sollers.java.basics;

public class FindEvenOdd {

	public static void main(String[] args) {
		findEvenAndOdd(10);
		findEvenAndOddUsingWhile(10);

	}

	public static void findEvenAndOdd(int number) {

		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even number");
			} else {
				System.out.println(i + " is Odd number");
			}
		}

	}

	public static void findEvenAndOddUsingWhile(int number) {

		if (number > 50) {
			int c = 10;
		}
//		int i = 10; =>  for ekak tiyenawa nam et i mehema define kala nohaka
		int x = 2;
		System.out.println("X outside before block : " + x);
		{
//			int x = 20;
			int y = 10;
			System.out.println(y);
			x = 5;
			System.out.println("X inside block : " + x);
		}
// continue with label 
		lbl: for (int i = 0; i < number; i++) {
			System.out.println("outer number is : " + i);
			for (int j = 0; j < number; j++) {
				System.out.println("inner number is : " + i);
				if (i == 5) {
					continue lbl;
				}
			}

		}
		System.out.println("X outside after block : " + x);
		// System.out.println("c value is" + c); // c cannot be resolved to a variable
	}

}
