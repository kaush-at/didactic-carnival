
public class FibonacciIterative {

	public int fibbonacci(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int current = 0;
		int previous = 1;
		int pPrevious = 0;

		for (int i = 2; i <= n; i++) {
			current = previous + pPrevious;
			pPrevious = previous;
			previous = current;
		}

		return current;
	}
}
