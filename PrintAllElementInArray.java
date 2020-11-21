import java.util.Arrays;

public class PrintAllElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// method 1
		System.out.println(Arrays.toString(arr));

		// method 2
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
