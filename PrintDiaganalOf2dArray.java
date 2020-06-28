package avr.java.day.six;

import java.util.Scanner;

public class PrintDiaganalOf2dArray {

	//print diagonal of 2d array
	public static void printDiagonal(int [][] array) {
		//int [][] array = {{20,30,40},{50,60,70},{80,90,100}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==j) {
					System.out.print(array[i][j]);
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		int [][] array = new int [3][3];
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter 3 X 3 matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				array [i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal of the matrix you entered is : ");
		printDiagonal(array);

	}

}

