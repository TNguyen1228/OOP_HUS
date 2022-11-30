import java.util.*;

public class Hex2Bin {
	private final String[] hexBits = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001",
			"1010", "1011", "1100", "1101", "1110", "1111" };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String hexStr = in.next();

		Hex2Bin aHex2Bin = new Hex2Bin();
		while (!aHex2Bin.isHex(hexStr)) {
			System.out.printf("Invalid Hexadecimal string \"%1$s\", try again...\n", hexStr);
			hexStr = in.next();
		}
		aHex2Bin.convertHexToBin(hexStr);
		in.close();
	}

	private boolean isHex(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
				return false;
			}
		}
		return true;
	}

	private void convertHexToBin(String hexStr) {

		System.out.printf("The equivalent binary for hexadecimal %1$s is ", hexStr);

		for (int i = 0; i < hexStr.length(); i++) {
			int j = Character.digit(hexStr.toLowerCase().charAt(i), 16);
			System.out.printf("%1$s ", hexBits[j]);
		}
		System.out.println();
	}

}
