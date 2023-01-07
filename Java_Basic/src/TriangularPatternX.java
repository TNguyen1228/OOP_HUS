import java.util.Scanner;

public class TriangularPatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = scanner.nextInt();
		printRightTrianglePattern(n);
		printLeftTrianglePattern(n);
		printReverseTriangle_1(n);
		prinReverseTriangle_2(n);
		scanner.close();
	}

	public static void printLeftTrianglePattern(int n) {
		for (int i = 0; i < n; i++) {
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints stars
				System.out.print("# ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	public static void printRightTrianglePattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void printReverseTriangle_1(int n) {
		for (int i = 0; i < n; i++) {
			int k = 0;
			while (k < i) {
				System.out.print("  ");
				k++;
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void prinReverseTriangle_2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}
	}
}
