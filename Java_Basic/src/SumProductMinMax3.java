import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum;
		int product;
		int min;
		int max;
		Scanner inScanner = new Scanner(System.in);

		int num1 = inScanner.nextInt();
		int num2 = inScanner.nextInt();
		int num3 = inScanner.nextInt();
		inScanner.close();
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		min = num1;
		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}
		max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The min and max is: " + min + " " + max);
	}

}
