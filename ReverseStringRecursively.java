
public class ReverseStringRecursively {

	public static void main(String[] args) {
		String reveseStr = reverseString("Kaush");
		System.out.println(reveseStr);
	}

	public static String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
