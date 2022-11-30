import java.util.Scanner;

public class GradesStatistics {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of students: ");
		int n = Integer.parseInt(scanner.next());
		int array_grades[] = readGrades(n);
		System.out.println("The average is: " + AvgGrades(array_grades));
		System.out.println("The minimum is: " + getMin(array_grades));
		System.out.println("The maximum is :" + getMax(array_grades));
	}

	static int[] readGrades(int n) {
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			int pos = i + 1;
			do {
				System.out.print("Enter the grade for student " + pos + ": ");
				array[i] = Integer.parseInt(scanner.next());
			} while (array[i] < 0 && array[i] > 100);
		}
		return array;
	}

	static double AvgGrades(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / array.length;
	}

	static int getMin(int arr[]) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = Math.min(res, arr[i]);
		return res;
	}

	static int getMax(int arr[]) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = Math.max(res, arr[i]);
		return res;
	}

}
