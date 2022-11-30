
import java.util.Scanner;

public class PerfectPrimeFactorList {
	public static boolean isPrime(int aPosInt) {
		if (aPosInt <= 1) {
			return false;
		} else if (aPosInt == 2) {
			return true;
		} else if (aPosInt % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(aPosInt); i += 2) {
			if (aPosInt % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isProductOfPrimeFactor(int aPosInt) {
		int prod = 1;
		for (int i = 2; i < aPosInt; i++) {
			prod *= isPrime(i) && (aPosInt % i == 0) ? i : 1;
		}
		return (prod == aPosInt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound:");
		int upper = sc.nextInt();
		int count = 0;
		System.out.println("These number are equal to the product of prime factors: ");
		for (int i = 2; i < upper; i++) {
			if (isProductOfPrimeFactor(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("[%d numbers found (%.2f%%)]", count, (double) count / upper * 100);
		sc.close();
	}
}
