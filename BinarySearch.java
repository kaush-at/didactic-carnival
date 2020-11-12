
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 12, 15, 27, 45, 67, 678 };
		int key = 68;
		System.out.println(search(arr, key));
	}

	public static int search(int[] arr, int key) {
		int min = 0;
		int max = arr.length - 1;
//		int min = 1;
//		int max = arr.length;  // for two element can get array index outof bound

		while (min <= max) {

			int mid = (min + max) / 2;
			System.out.println("mid index is " + mid);
			System.out.println("mid value is " + arr[mid]);

			if (key == arr[mid]) {
				return mid;
			}

			if (key > arr[mid]) {
				min = mid + 1;
			}

			if (key < arr[mid]) {
				max = mid - 1;
			}

		}

		return -1;
	}

}
