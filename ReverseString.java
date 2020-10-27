package com.challenges.strings;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String result = reverseStringUsingStack("hello");
		System.out.println(result);
	}

	// reverse string using stack
	public static String reverseStringUsingStack(String word) {

		// space complexity is O(n) because of stack
		Stack<Character> charStack = new Stack<>();
		String revString = "";

		for (int i = 0; i < word.length(); i++) {
			charStack.push(word.charAt(i));
		}

		System.out.println(charStack.toString());

		for (int i = charStack.size() - 1; i >= 0; i--) {
			revString += charStack.pop();
			System.out.println();
		}

		return revString;
	}

}
