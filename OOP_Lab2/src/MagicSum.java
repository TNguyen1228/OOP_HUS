import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final int SEN = -1;
		int number;
		int magic_sum = 0;
		do {
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = Integer.parseInt(scanner.next());
			if (hasEight(number)) {
				magic_sum += number;
			}
		} while (number != SEN);
		System.out.println("The magic sum is: " + magic_sum);
		scanner.close();
	}

	public static boolean hasEight(int number) {
		while (number > 0) {
			if (number % 10 == 8)
				return true;
			number = number / 10;
		}
		return false;
	}
}
