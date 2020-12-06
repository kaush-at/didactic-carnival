package assignment3;

public class Calculator {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;

		System.out.println(calculator(a, '+', b));
		System.out.println(calculator(a, '-', b));
		System.out.println(calculator(a, '/', b));
		System.out.println(calculator(a, '*', b));
		System.out.println(calculator(a, '=', b));
	}

	public static double calculator(int a, char operator, int b) {

		double result = 0;

		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '/':
			result = a / b;
			break;
		case '*':
			result = a * b;
			break;
		default:
			System.out.println("please enter valid operator");
			break;
		}

		return result;

	}

}
