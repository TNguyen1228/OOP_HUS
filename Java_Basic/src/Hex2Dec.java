import java.util.Scanner;

public class Hex2Dec {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the hexadecimal string: ");
		String hexString = scanner.nextLine();
		if (CheckHexStr(hexString)) {
			System.out.printf("The equivalent decimal number for hexadecimal %s is: %d", hexString, Integer.parseInt(hexString, 16));
		} else {
			System.err.println("Invalid hexadecimal string " + hexString);
		}
	}

	static boolean CheckHexStr(String inputString) {
		boolean isHex = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
				isHex = false;
				break;
			}
		}
		return isHex;
	}

}
