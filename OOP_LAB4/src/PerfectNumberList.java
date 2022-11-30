import java.util.Scanner;

public class PerfectNumberList {
	public static boolean isPerfect(int aPosInt) {
		int sum = 1;
		for (int i = 2; i * i <= aPosInt; i++) {
			if (aPosInt % i == 0) {
				if (i * i != aPosInt) {
					sum += i + aPosInt / i;
				} else {
					sum += i;
				}
			}
		}
		if (sum == aPosInt && aPosInt != 1) {
			return true;
		}
		return false;
	}

	public static boolean isDeficient(int aPosInt) {
		int sum = 0;
		for (int i = 1; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i == 0) {
				if (aPosInt / i == i) {
					sum += i;
				} else {
					sum += i;
					sum += aPosInt / i;
				}
			}
		}
		return sum < 2 * aPosInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound:");
		int upper = sc.nextInt();
		int count1 = 0, count2 = 0;
		System.out.println("These numbers are perfect: ");
		for (int i = 2; i <= upper; i++) {
			if (isPerfect(i)) {
				count1++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[" + count1 + " perfect numbers found " + "(" + (double) count1 / upper * 100 + "%)]");
		System.out.println("These numbers are neither deficient nor perfect: ");
		for (int i = 2; i <= upper; i++) {
			if (!isPerfect(i)&&!isDeficient(i)) {
				count2++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[" + count2 + " perfect numbers found " + "(" + (double) count2 / upper * 100 + "%)]");
		sc.close();
	}

}
