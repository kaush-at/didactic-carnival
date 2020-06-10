package avr.java.day.six;

import java.util.Arrays;
import java.util.Scanner;

public class AccendingOrderOfArray2 {
	
	// sort array
	public static int[] sortArray(int [] array) {
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					sorted = false;
				}
			}
			
		}
		
		return array;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int[] result = sortArray(numbers);
		System.out.println("The Accending order of your numbers : "+Arrays.toString(result));
	}
	

}
