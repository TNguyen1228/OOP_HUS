import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Octal string: ");
		String inputString = scanner.nextLine();
		scanner.close();
		int decimal = Integer.parseInt(inputString, 8);
		System.out.printf("The equivalent decimal number of %s Octal string is: %d ", inputString, decimal);
	}

}
