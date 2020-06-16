package avr.java.day.six;

import java.util.Scanner;

public class FindZeroCountOfArray {

	
	//find the  minimum value of an array
	public static int findZerosCount(int a[]) {
		
		//System.out.println(Arrays.toString(a));
		
		int zeroCount = 0;
		for(int i = 0; i < a.length; i++) {
			zeroCount += findZeros(a[i]);
		}
		
		return zeroCount;
	}
	
	//find zero count of a single number
	public static int findZeros(int number) {
		int count = 0;
		
		while(number > 0) {
			int remainder = number % 10;
			if(remainder == 0) {
				count++;
			}
			number = number / 10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int [] numbers = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers you want : ");
		
		for(int i = 0;  i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int zerosCount = findZerosCount(numbers);
		System.out.println("Total zero count in your numbers : "+ zerosCount);

	}
}
