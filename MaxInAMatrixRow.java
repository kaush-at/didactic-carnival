package avr.java.day.seven;

import java.util.Scanner;

public class MaxInAMatrixRow {

	//find the max number in a row
	public static void findMaxInMatrixRow(int array [][]) {
		//int [][] array = {{1,2,3},{8, 4 ,9},{1,5,3}};
		
		for(int i = 0; i < array.length; i++) {
			int max = array[i][0];
			String row = "";
			for(int j = 0; j < array.length; j++) {
				if(array[i][j] > max) {
					max = array[i][j];
				}
				row += array[i][j]+" ";
			}
			row += "Max => "+ max;
			System.out.println(row);
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

		findMaxInMatrixRow(array);
	}

}
/*
1 3 5 => max 5
9 7 4 => max 9
5 6 1 => max 6
*/