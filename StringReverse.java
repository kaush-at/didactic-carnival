package avr.java.day.seven;

import java.util.Scanner;

public class StringReverse {

	public static String reverseString(String str) {
		String revString = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println("i" + i);
			revString += str.charAt(i);
		}
		return revString;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string you want to reverse : ");
		String str = sc.nextLine();
		String reverse = reverseString(str);
		System.out.println(reverse);

	}

}
