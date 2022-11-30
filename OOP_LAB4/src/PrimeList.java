import java.util.Scanner;

public class PrimeList {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound:");
		int upper = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= upper; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}

		System.out.printf("[%d primes found (%.2f%%)]", count, (double) count / upper * 100);
		sc.close();
	}

}
