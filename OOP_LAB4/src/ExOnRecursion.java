
public class ExOnRecursion {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int lenOfString(int n) {
		if (n < 10) {
			return n;
		}
		return lenOfString(n - 1) + String.valueOf(n).length();
		
	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
	
	public static void main(String[] args) {
		System.out.println(lenOfString(10));
	}
}
