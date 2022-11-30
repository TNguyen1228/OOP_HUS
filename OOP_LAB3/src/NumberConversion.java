import java.util.Scanner;

public class NumberConversion {
	private final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		NumberConversion aNumberConversion = new NumberConversion();
		System.out.println("Enter the input radix: ");
		int inRadix = scanner.nextInt();
		System.out.println("Enter the string: ");
		String inputString = scanner.next();
		System.out.println("Enter the output radix: ");
		int outRadix = scanner.nextInt();
		System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n", inputString, inRadix,
				aNumberConversion.toRadix(inputString, inRadix, outRadix), outRadix);
	}

	private int toInt(String in, int inRadix) {
		int result = 0;
		for (int i = in.length() - 1; i >= 0; i--) {
			int digit = Character.digit(in.charAt(i), inRadix);
			result += digit * Math.pow(inRadix, (in.length() - 1 - i));
		}
		return result;
	}

	private String toRadix(int number, int radix) {
		String result = "";
		if (radix == 0) {
			return result;
		}

		while (number > 0) {
			result = alphabet.charAt(number % radix) + result;
			number /= radix;
		}
		return result;
	}

	private String toRadix(String in, int inRadix, int outRadix) {
		if (inRadix == outRadix) {
			return in;
		}
		return toRadix(toInt(in, inRadix), outRadix);
	}

}
