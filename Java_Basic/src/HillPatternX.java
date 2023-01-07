import java.util.Scanner;

public class HillPatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int n = scanner.nextInt();
		// printPyramid(n);
		printReversePyramid(n);
		scanner.close();
	}

	public static void printPyramid(int n) {
		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("# ");
			}

			// ending line after each row
			System.out.println();
		}
	}

	public static void printReversePyramid(int n) {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - 1 - i; k++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
	}
}
