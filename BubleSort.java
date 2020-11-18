import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 22, 0, 4, 34, 12 };
		int[] sortedArr = bubleSort(arr);
		System.out.println(Arrays.toString(sortedArr));

	}

	public static int[] bubleSort(int[] arr) {

		boolean isSorted = false;

		while (!isSorted) {

			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}

		}

		return arr;
	}

}
