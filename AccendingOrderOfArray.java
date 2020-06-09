package avr.java.day.six;

import java.util.Arrays;
import java.util.Scanner;

public class AccendingOrderOfArray {

	
	public static int[] accendingOrder(int[] array) {
		
		int size = array.length;
		int [] resArray = new int [size];
		int length = 0;
		
		boolean exit = true;
		
		while(exit) {
			int  k = 0;
			
			// call the findMinValueFunction
			int[] minArr = findMinValue( array);
			int index = minArr[1];
			
			// copy array element without min value in to another array
			int[] testArray = new int[array.length-1]; 
			for(int j = 0; j < array.length; j++) {
				if((j != index)) {
					testArray[k] = array[j];
					k++;
				}
			}
			
			array = testArray;
			resArray[length] = minArr[0];
			length++;
			
			if(array.length == 0) {
				exit = false;
				}
			}

		return resArray;
				
	}
	
		// find the min value and index
		public static int[] findMinValue(int[] array) {
			int min = array[0];
			int[] result = new int [2];
			int index = 0;
			for(int i = 0; i < array.length; i++) {
				if(min >= array[i]) {
					min = array[i];
					index = i;   
				}
			}
			result[0] = min;
			result[1] = index;
			return result;
		}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int[] result = accendingOrder(numbers);
		System.out.println("The order you entered : "+Arrays.toString(numbers));
		System.out.println("The Accending order of your numbers : "+Arrays.toString(result));

	}
	
	
}
