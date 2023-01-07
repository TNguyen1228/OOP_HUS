import java.util.Scanner;

public class RadixN2Dec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int radix;
		System.out.print("Enter the radix: ");
		radix = Integer.parseInt(scanner.next());
		while (radix > 16 || radix < 0) {
			System.err.println("Invalid radix. Try again...");
			radix = scanner.nextInt();
		}

		System.out.print("Enter the string: ");
		String inputString = scanner.next();
		if (radix == 16) {
			while (!CheckHexStr(inputString)) {
				System.err.println("Invalid hex String, try again...");
				inputString = scanner.next();
			}
		} else if (radix == 2) {
			while (!CheckBinStr(inputString)) {
				System.err.println("Invalid binary string, try again...");
				inputString = scanner.next();
			}
		}
		int decimal = Integer.parseInt(inputString, radix);
		System.out.printf("The equivalent decimal number of %s string is: %d ", inputString, decimal);
		scanner.close();
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

	static boolean CheckBinStr(String inputString) {
		boolean isBin = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (!(ch == '0' || ch == '1')) {
				isBin = false;
				break;
			}
		}
		return isBin;
	}
}
