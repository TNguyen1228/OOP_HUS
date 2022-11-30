import java.util.Scanner;

public class PrintArray {

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
		int items[] = new int[num_items];
		if (items.length > 0) {
			System.out.print("Enter the value of all items: ");
			for (int i = 0; i < items.length; i++) {
				items[i] = Integer.parseInt(scanner.next());
			}
		}
		for (int i = 0; i < items.length; i++) {
			if (i == 0) {
				System.out.print(items[0]);
			} else {
				System.out.print(", " + items[i]);
			}
		}
		scanner.close();
	}

}
