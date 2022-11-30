import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a hex string: ");
		String inputString = scanner.nextLine();
		boolean isHex = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
				System.out.println(inputString + " is not a hex string");
				isHex = false;
				break;
			}
		}
		if (isHex) {
			System.out.println(inputString + " is a hex string");
		}
		scanner.close();
	}

}
