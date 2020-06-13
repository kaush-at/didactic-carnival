package avr.java.day.eight;

import java.util.Scanner;

public class deliverPattern {

	public static int[] getPattern(String pattern) {
		 
		int countUp = 0;
		int countDown = 0;
		int level =0;
		int ground = 1;
		int [] resArr = new int [2];
		
		
		for(int i =0; i <  pattern.length(); i++) {
			if(pattern.charAt(i)=='^') {
				countUp ++;
				level += 1;
			}else {
				countDown++;
				level -= 1;
			}
			
			if(level == 0) {
				ground += 1;
			}
		}
		 
		int floor = Math.abs( countUp - countDown );
		resArr[0] = floor;
		resArr[1] = ground;
		
		return resArr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter delivery pattern : ");
		String pattern = sc.nextLine();
		
		int [] result = getPattern(pattern);
		
		System.out.println("Target floor is : "+ result[0]+" & Number of ground floor visits : "+result[1]);

	}

}
