package com.challenges.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostOccurenceWord {

	/*
	 * Given an array of words find the most occurring word in it
	 * 
	 * Input : arr[] = {"data", "for", "data", "a", "portal", "to", "learn", "can",
	 * "be", "computer", "science", "zoom", "yup", "fire", "in", "be", "data",
	 * "data"}
	 */
	public static int getMaxCountOfArraWord(String[] arr) {

		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (wordMap.containsKey(arr[i])) {
				int x = wordMap.get(arr[i]);
				wordMap.put(arr[i], x + 1);

			} else {
				wordMap.put(arr[i], 1);
			}
		}

		int maxCount = 0;
		String word = "";

		for (Entry<String, Integer> value : wordMap.entrySet()) {
			if (maxCount < value.getValue()) {
				maxCount = value.getValue();
				word = value.getKey();
			}
		}
		System.out.println("Max occurence word is : " + word + " and it occurs in " + maxCount + " times");
		return maxCount;
	}

	public static void main(String[] args) {

		String arr[] = { "data", "for", "data", "a", "portal", "to", "learn", "can", "be", "computer", "science",
				"zoom", "yup", "fire", "in", "be", "data", "data" };
		System.out.println(getMaxCountOfArraWord(arr));
	}

}
