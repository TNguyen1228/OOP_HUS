import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String lineString = scanner.nextLine();
		scanner.close();
		int vowels = 0, digits = 0;
		lineString = lineString.toLowerCase();
		for (int i = 0; i < lineString.length(); i++) {
			char ch = lineString.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (Character.isDigit(ch)) {
				digits++;
			}
		}
		System.out.printf("Number of vowels: %d (%.2f%%)\n", vowels, (double) vowels / lineString.length() * 100);
		System.out.printf("Number of digits: %d (%.2f%%)\n", digits, (double) digits / lineString.length() * 100);

	}

}
