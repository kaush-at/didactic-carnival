package com.challenges.strings;

public class LengthOfTheLastWord {

	public static void main(String[] args) {
		int count = getTheSizeOfLastWord(" hello   ty  www");
		int count1 = getTheSizeOfLastWordByReversing(" hello   ty  www ");
		int count2 = getSizeOfLastWord(" hello   ty  www ");
		System.out.println("The length of the last word is : " + count);
		System.out.println("The length of the last word is by second method: " + count1);
		System.out.println("The length of the last word is by Third method: " + count2);
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

	// Method 2 -> Reverse and get the first letter count
	public static int getTheSizeOfLastWordByReversing(String word) {
		String revString = "";
		int count = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			revString += word.charAt(i);
		}
		for (int i = 0; i < revString.length(); i++) {
			if (revString.charAt(i) != ' ') {
				count++;
			}
			if (count > 0 && revString.charAt(i) == ' ') {
				return count;
			}
		}

		return count;
	}

	// Method 3 -> cunting from the end
	public static int getSizeOfLastWord(String word) {
		int count = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			if (word.charAt(i) != ' ') {
				count++;
			}
			if (count > 0 && word.charAt(i) == ' ') {
				return count;
			}
		}
		return count;
	}

}
