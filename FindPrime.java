package avr.java.day.three;

import java.util.Scanner;

public class FindPrime {

	public static String isPrime(int n) {
		if (n < 2) {
			return "The number you entered is not a prime number";
		}
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return "The number you entered is not a prime number";
			}
		}
		
		return "The number you entered is a prime number";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		String result = isPrime(n);
		System.out.println(result);

	}

}
