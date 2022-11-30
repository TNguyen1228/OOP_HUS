
public class TrigonometricSeries {
	private static double calculateTerm(double x, int numTerms) {
		double term = 1.0;
		for (int i = numTerms; i > 0; i--) {
			term *= x / i;
		}
		return term;
	}

	public static double sin(double x, int numTerms) {
		double result = 0.0;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i + 1));
		}
		return result;
	}

	public static double cos(double x, int numTerms) {
		double result = 0.0;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, 2 * i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
