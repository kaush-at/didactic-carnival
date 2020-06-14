package avr.java.day.six;

import java.util.Scanner;

public class FindMinValueOfArray {

	//find the min value
	public static int getMinValueofArray(int[] a) {
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(min >a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int minValue = getMinValueofArray(numbers);
		System.out.println("The minimum value is : "+minValue);
	}
	
	
	
	

	

}
