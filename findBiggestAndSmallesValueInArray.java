package com.challenges.common;

public class findBiggestAndSmallesValueInArray {

	public static void main(String[] args) {
		int numbers[] = new int[] { 33, 53, 73, 94, 22, 45, 23, 87, 13, 63 };
		findMinAndMaxElement(numbers);

	}

	public static void findMinAndMaxElement(int[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Min value in array is " + min);
		System.out.println("Max value in array is " + max);
	}

}
