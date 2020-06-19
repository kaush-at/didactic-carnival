package avr.java.day.eight;

import java.util.Scanner;

public class Ispalindrome {
	
	public static boolean isPalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		
		String rev =  new String(sb.reverse());
		if( rev.equalsIgnoreCase(str)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your String : ");
		 String str = sc.next();
		 
		 boolean result = isPalindrome(str);
		 if(result) {
			 System.out.println("The word you entered is a palindrome");
		 }else {
			 System.out.println("The word you entered is Not a palindrome");
		 }
		 
	}



}
