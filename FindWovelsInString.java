package com.challenges.common;

public class FindWovelsInString {

	public static void main(String[] args) {

		int count = vowelsCount("Hello");
		System.out.println(count);

		int count1 = vowelsCount2("Hello");
		System.out.println(count1);
	}

	public static int vowelsCount(String word) {
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;
	}

	// method 2
	public static int vowelsCount2(String word) {
		int count = 0;
		String vowels = "aeiou";

		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(word.toLowerCase().charAt(i) + "")) {
				count++;
			}
		}
		return count;
	}

}
