import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = scanner.nextLine();
		int strLength = inputString.length();
		String outputString = "";
		for (int i = strLength - 1; i >= 0; i--) {
			outputString += inputString.charAt(i);
		}
		System.out.println("The reverse string is: " + outputString);
		scanner.close();
	}
}
