package com.challenges.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsStartingWithVowels {

	public static void main(String[] args) {
		printWordStartingWithVowels("hello Irin how Are you doin today");
	}

	public static void printWordStartingWithVowels(String sentence) {

		String[] strArr = sentence.split(" ");
		System.out.println(Arrays.toString(strArr));
		String vowels = "aeiou";

		List<String> resArr = new ArrayList<>();

		for (int i = 0; i < strArr.length; i++) {
			char ch = strArr[i].toLowerCase().charAt(0);
			if (vowels.contains(ch + "")) {
				System.out.println(strArr[i]);
				resArr.add(strArr[i]);
			}
		}
		for (String item : resArr) {
			System.out.println("Inside ArrayList " + item);
		}

	}

}
