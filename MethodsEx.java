package avr.java.day.two;

public class MethodsEx {
	
	private static String checkAbility(int age) {
		if(age >= 18) {
			return "You can Enter";
		}else {
			return "You are not allowed";
		}
	}

	public static void main(String[] args) {
		int age = 25;
		String result = checkAbility(age);
		System.out.println(result);
	}
}
