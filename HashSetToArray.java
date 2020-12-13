package collections.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetToArray {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);

		System.out.println("Hash Set values : " + set);

		Iterator<Integer> itr = set.iterator();

		int[] arr = new int[set.size()];
		int i = 0;
		while (itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}

		System.out.println("Array values are :" + Arrays.toString(arr));

	}
}
