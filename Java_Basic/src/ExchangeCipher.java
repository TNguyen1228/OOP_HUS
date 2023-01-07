import java.util.Scanner;

public class ExchangeCipher {
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the plaintext string: ");
		String inputString = scanner.nextLine();
		scanner.close();
		inputString = inputString.toUpperCase();
		System.out.print("The ciphertext string is: ");
		String encryptString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			int pos = ALPHABET.indexOf(ch) % 26;
			encryptString += ALPHABET.charAt(25 - pos);
		}
		System.out.print(encryptString);
	}

}
