package avr.java.day.eight;

import java.util.Scanner;

public class LuckyNumbers {

	public static int getLuckyNumber(String str) {
		int luckyNumber = 0 ;
		String[] myArray= str.split("-");
//		System.out.println(Arrays.toString(myArray));
		
		for (int i = 0; i < myArray.length; i++) {
			int ele = Integer.parseInt(myArray[i]);
			luckyNumber += digitAddition(ele);
		}
		
		while(luckyNumber > 10) {
			luckyNumber = digitAddition(luckyNumber);
			
		}
		
		return luckyNumber;
	}
	
	public static int digitAddition(int number) {
		int count = 0;
		while(number > 0) {
			int remainder = number % 10;
			count += remainder;
			number /= 10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a date in DD-MM-YYYY format : ");
		 String str = sc.nextLine();
		 
		 int luckyNumber = getLuckyNumber(str);
		 System.out.println("The lucky number is : "+ luckyNumber);
	}



}
