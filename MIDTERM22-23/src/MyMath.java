
public class MyMath {
	public MyMath() {

	}

	public static double cos(double x) {
		double cos = 0;
		for (int i = 0; i <= 20; i++) {
			double f = 1;
			int pow = 2 * i;
			for (int j = 1; j <= 2 * i; j++) {
				f *= j;
			}
			cos += Math.pow(-1, i) * Math.pow(x, pow) / f;
		}
		return cos;
	}

	public static double exp(double x) {
		double expResult = 0;
		for (int i = 0; i <= 10; i++) {
			double f = 1;
			int pow = i;
			for (int j = 1; j <= i; j++) {
				f = f * j;	
			}
			expResult += Math.pow(x, pow) / f;
		}
		return expResult;
	}

	public static String toDecimal(String number, int inRadix) {
		String result = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			int digit = Character.digit(number.charAt(i), inRadix);
			result += digit * Math.pow(inRadix, (number.length() - 1 - i));
		}
		return result;
	}

	public static String decimalTo(String number, int outRadix) {
		int decimalString = Integer.parseInt(number);
		String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
		String result = "";
		if (outRadix == 0 || outRadix > 16) {
			return result;
		}

		while (!(number.isEmpty())) {
			result = alphabet.charAt(decimalString % outRadix) + result;
			decimalString /= outRadix;
		}
		return result;
	}

	public static String toRadix(String number, int inRadix, int outRadix) {
		if (inRadix == outRadix) {
			return number;
		}
		return decimalTo(toDecimal(number, inRadix), outRadix);
	}

	public static void main(String[] args) {
		System.out.println("e^2.2*cos(3.3) (without using java doc)=" + exp(2.2) * cos(3.3));
		System.out.println("e^2.2*cos(3.3) (using java doc)=" + Math.exp(2.2) * Math.cos(3.3));
		System.out.println(toRadix("1234569", 13, 8));

	}
}
