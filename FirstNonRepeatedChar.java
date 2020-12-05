package assignment3;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Hello"; // => l
		String str1 = "Hi how is everything? "; // => i
		String str2 = "?who are you"; // => o
		String str3 = "Hi"; // => 0

		System.out.println(findFirstNonRepeatedChar(str));
		System.out.println(findFirstNonRepeatedChar(str1));
		System.out.println(findFirstNonRepeatedChar(str2));
		System.out.println(findFirstNonRepeatedChar(str3));
	}

	public static char findFirstNonRepeatedChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);

			for (int j = i + 1; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1 == ch2) {
					return ch1;
				}
			}
		}
		return 0;

	}

}
