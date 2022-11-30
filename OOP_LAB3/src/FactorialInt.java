public class FactorialInt {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int fn = 1;
		while (true) {
			System.out.printf("The factorial of %1$d is %2$d.\n", i, fn);
			if (Integer.MAX_VALUE / fn < (i + 1)) {
				System.out.printf("The factorial of %d is out of range.\n", (i + 1));
				break;
			}
			i++;
			fn *= i;
		}

	}

}
