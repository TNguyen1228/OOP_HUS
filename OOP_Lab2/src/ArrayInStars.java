import java.util.Scanner;

public class ArrayInStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num_items;
		System.out.print("Enter the number of items: ");
		num_items = Integer.parseInt(scanner.next());
		while (num_items < 0) {
			System.err.println("Invalid number, try again...");
			num_items = Integer.parseInt(scanner.next());
		}
		int array[] = new int[num_items];
		if (array.length > 0) {
			System.out.print("Enter the value of all items: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(scanner.next());
			}
		}
		printArrayInStars(array);
		scanner.close();
	}

	public static void printArrayInStars(int[] array) {
		// Write some code in here
		for (int index = 0; index < array.length; index++) {
			int number = array[index];
			System.out.print(index + ": ");
			for (int star = 1; star <= number; star++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}
