import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = Integer.parseInt(scanner.next());
		System.out.print("Enter the exponent: ");
		int exp = Integer.parseInt(scanner.next());
		System.out.println(base + " raise to the power of " + exp + " is: " + exponent(base, exp));
		scanner.close();
	}

	public static int exponent(int base, int exp) {
		int result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}

}
