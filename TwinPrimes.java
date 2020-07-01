package avr.java.day.four;

import java.util.Scanner;

public class TwinPrimes {
	
// twin prime is a prime that has a prime gap of two. 
	
	//get the twin primes
	public static String getTwinPrime(int start, int end) {
		String allPrimeNumbers = "";
		for(int i = start; i <= end; i++) {
			if(isPrime(i) && isPrime(i+2) && (i+2 <= end)) {
				allPrimeNumbers += "("+i+","+(i+2)+")";
			}
		}
		return allPrimeNumbers;
	}
	
	
	// find the prime numbers
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		for(int i = 2; i < number; i++) { 
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value : ");
		int start = sc.nextInt();
		
		System.out.println("Enter another number : ");
		int end = sc.nextInt();
		
		String result = getTwinPrime(start, end);
		System.out.println(result);

	}

}

// not readable code written by classmate
//String prime = "";
//int j;
//int a=1;
//
//int min = 5;
//int max = 15;
//
//for(int i = min; i < max; i++) {
//	System.out.println("****************************************************");
//	System.out.println("i "+i);
//	for( j = 2; j < i; j++) {
//		System.out.println("j" + j);
//		if(i%j==0) {
//			break;	
//		}
//	}
//	System.out.println("step @");
//	System.out.println("i "+ i + "j " +j);
//	
//	if(i == j) {
//		System.out.println("step *");
//		prime += i + "";
//		System.out.println("prime " +prime);
//		if((i - a) == 2) {
//			System.out.println("("+(i-2)+","+i+")");
//		}
//		a=i; //2
//	}
//}
