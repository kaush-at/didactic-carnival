
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 6, 89, 5, 4566, 8, 68 };
		int key = 89;
		System.out.println(search(arr, key));
	}

	public static boolean search(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;

	}

}
