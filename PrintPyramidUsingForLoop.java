package avr.java.day.five;

public class PrintPyramidUsingForLoop {
	
/*  print this pattern using for loops
		//	*
		//	* *
		//	* * *
		//	* * * *
		//	* * * * *
*/
	public static void printPyramid1(){
		// based on the row stars are printed
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	}
	
	
	
	
/*-------------------------------------------------------
 		print this pattern using for loops
				    *
				   * *
				  * * *
				 * * * *
				* * * * *
				
----------------------------------------------------*/
	public static void printPyramid2() {

		for(int i = 1; i <= 5; i++) {
			for(int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
				
			System.out.println("");
		}
		
	}
	
	
	
	
	
/*-------------------------------------------------------
	print this pattern using for loops
		 
			    *
			   * *
			  * * *
			 * * * *
			* * * * *
		     * * * *
		      * * *
		       * * 
		        * 
-----------------------------------*/
	public static void printPyramid3() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i = 4; i >= 1; i--) {
			for(int j = 5; j >= i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	
	
/*	------------------------------------------------------------
  			print this pattern using for loops
	 
				   * * * * *
				   * 	   *
				   *       *
				   *       *
				   * * * * * 

-----------------------------------*/
	public static void printPyramid4() {
	
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == 1 || i == 5 || j == 1 || j == 5 ){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	
	
	
/*	------------------------------------------------------------
		print this pattern using for loops	
					    1
					   121
					  12321
					 1234321
					123454321
-------------------------------------------------------------------*/	
	public static void printPyramid5() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for(int l = i-1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String args[]) {
//		printPyramid1();
//		printPyramid2();
//		printPyramid3();
//		printPyramid4();
		printPyramid5();
	}
	
}
