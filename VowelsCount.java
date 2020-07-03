package avr.java.day.eight;

import java.util.Scanner;

public class VowelsCount {
	
	// method 1
	public static int vowelsCount(String str) {
		int vowelCount = 0;
		char letter ;
		for(int i = 0; i < str.length(); i++) {
			letter = str.toLowerCase().charAt(i);
			if((letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')) {
				vowelCount+=1;
			}
		}
		return vowelCount;
	}
	
	// method 2
	public static int vowelsCount2(String str) {
		int vowelCount = 0;
		String vowels = "aeiou";
		char letter ;
		for(int i = 0; i < str.length(); i++) {
			letter = str.toLowerCase().charAt(i);
			if((vowels.contains(letter+""))) {
				vowelCount+=1;
			}
		}
		return vowelCount;
	}
	
	 public static void main (String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your String : ");
		 String str = sc.nextLine();
		 
		 int vowelCount = vowelsCount(str);
		 int vowelCount2 = vowelsCount2(str);
		 
		 System.out.println("The vowels count is (Method 1): "+ vowelCount);
		 System.out.println("The vowels count is (Method 2): "+ vowelCount2);
		 
	 }
}
