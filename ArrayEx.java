
package avr.java.day.five;

import java.util.Scanner;



public class ArrayEx {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		int numbers[] = new int[3];
		Scanner sc = new Scanner(System.in);
		//PrintPyramidUsingForLoop.printPyramid1();
		
		System.out.println("Enter 3 numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = sum / numbers.length;
		
		System.out.println("The average of your numbers is : "+ average);
		
	}

}
