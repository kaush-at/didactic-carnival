package avr.java.day.three;

import java.util.Scanner;

public class FindArmstrongNumber {
	
//	An Armstrong number is a number such that the sum of its digits raised to the third power is equal to the number itself.  
//	For example, 371 is an Armstrong number, since 3**3 + 7**3 + 1**3 = 371.

	//public static String isArmstrongNumber(int n) {
		
//		int initialNumber = n;
//		int digits = 0;
//		int number = n;
//		int sum = 0;
//		// find the digits of n
//		while(number > 0) {
//			digits++;
//			number = number / 10;
//		}
//		
//		//get the power of digit
//		while(n > 0) {
//			sum += Math.pow((n % 10), digits);
//			n = n/10;
//		}
//		
//		// check initial number is equal to sum of the power of digits
//		if(sum == initialNumber) {
//			return "The Number you are entered is an Armstrong Number";
//		}else {
//			return "The Number you are entered is NOT an Armstrong Number";
//		}
//		
//	}
		//}
	public static String isArmstrongNumber(int n) {
		int result = powerOfDigits(n);
		
		if (result == n) {
			return "The Number you are entered is an Armstrong Number";
		}else {
			return "The Number you are entered is NOT an Armstrong Number";
		}
	
	}
	//power of the digits
	public static int powerOfDigits(int n) {
		int total = 0;
		int digitCount = getTheDigitCount(n);
		
		while(n > 0) {
			int digit = n % 10;
			total += Math.pow(digit, digitCount);
			n = n / 10;
		}
			
		return total;
	}
	
	//get the digits count of a number
	public static int getTheDigitCount(int n) {
		int result = 0;
		while(n > 0) {
			result++;
			n = n / 10;
		}
		return result;
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		String result = isArmstrongNumber(n);
		System.out.println(result);

	}

}
