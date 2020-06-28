package avr.java.day.one;

public class NextMultipleOfHundrads {

	public static void main(String[] args) {
		int value = 2127;
		
		int remainder = value % 100;
		int rest = 100 - remainder ;
		
		System.out.println("next Multiple of hundrad is : " + (rest+value) );

	}

}
