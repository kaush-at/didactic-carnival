package collections.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetToArrayList {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<Integer>();

		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);

		System.out.println("Hash Set values : " + set);

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			list.add(itr.next());
		}

		System.out.println("ArrayList values are :" + list);

	}

}
