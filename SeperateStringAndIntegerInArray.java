import java.util.ArrayList;
import java.util.List;

public class SeperateStringAndIntegerInArray {

	public static void main(String[] args) {

		String[] mynum = { "1", "4", "2", "6", "Volvo", "BMW", "Ford", "Mazda", "4", "5", "2", "1" };
		List<String> list = new ArrayList<String>();

		int sum = 0;

		for (int i = 0; i < mynum.length; i++) {
			try {
				sum += Integer.parseInt(mynum[i]);
			} catch (NumberFormatException e) {
				list.add(mynum[i]);
			}
		}

		System.out.println(sum);
		System.out.println(list);

	}

}
