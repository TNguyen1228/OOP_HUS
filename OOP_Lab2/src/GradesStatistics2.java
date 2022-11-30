import java.util.Scanner;

public class GradesStatistics2 {
	static Scanner scanner = new Scanner(System.in);
	public static int[] grades;

	public static void readGrades() {
		System.out.print("Enter the number of students: ");
		int n = Integer.parseInt(scanner.next());
		for (int i = 0; i < n; i++) {
			int pos = i + 1;
			do {
				System.out.print("Enter the grade for student " + pos + ": ");
				grades[i] = Integer.parseInt(scanner.next());
			} while (grades[i] < 0 && grades[i] > 100);
		}
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[0]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
	}

	public static double average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / array.length;
	}

	public static double median(int[] array) {
		double m = 0;

		if (array.length % 2 == 1) {
			m = array[((array.length + 1) / 2) - 1];

		} else {
			m = (array[array.length / 2 - 1] + array[array.length / 2]) / 2;

		}
		return m;
	}

	public static int max(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = Math.max(res, arr[i]);
		return res;
	}

	public static int min(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = Math.min(res, arr[i]);
		return res;
	}

	public static double stdDev(int[] array) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = array.length;

		for (double num : array) {
			sum += num;
		}

		double mean = sum / length;

		for (double num : array) {
			standardDeviation += Math.pow(num - mean, 2);
		}

		return Math.sqrt(standardDeviation / length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readGrades();
		System.out.println("The grades are: ");
		print(grades);
		System.out.println("The average is " + average(grades));
		System.out.println("THe median is " + median(grades));
		System.out.println("THe minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
		System.out.println("THe standard deviation is " + stdDev(grades));

	}

}
