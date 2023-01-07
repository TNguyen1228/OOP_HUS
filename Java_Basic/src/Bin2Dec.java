import java.util.Scanner;

public class Bin2Dec {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the binary string: ");
		String binString = scanner.nextLine();
		while (!CheckBinStr(binString)) {
			System.err.println("Invalid binary string, try again...");
			binString = scanner.nextLine();
		}
		int decimal = Integer.parseInt(binString, 2);
		System.out.printf("The equivalent decimal number for binary %s is: %d", binString, decimal);
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
