package com.challenges.strings;

public class LengthOfTheLastWord {

	public static void main(String[] args) {
		int count = getTheSizeOfLastWord(" hello   ty  www");
		System.out.println("The length of the last word is : " + count);
	}

	// Method 1 -> start iterating from the beginning
	public static int getTheSizeOfLastWord(String word) {

		int count = 0;
		int previousCount = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				if (count > 0) {
					previousCount = count;
					count = 0;
				}

			} else {
				count++;
			}
		}

		if (count == 0) {
			return previousCount;
		} else {
			return count;
		}
	}

}
