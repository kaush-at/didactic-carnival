import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 22, 0, 4, 34, 12 };
		int[] sortedArr = selectionSortAlgo(arr);
		System.out.println("Sorted array with selection sorting " + Arrays.toString(sortedArr));
	}

	public static int[] selectionSortAlgo(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		return arr;
	}

}
