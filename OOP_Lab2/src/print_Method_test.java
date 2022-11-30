import java.util.Scanner;

public class print_Method_test {
	public static void main(String[] args) {
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

	public static void print(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[0]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
	}

	public static void print(float[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[0]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
	}

	
}
