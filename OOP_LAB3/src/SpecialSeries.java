
public class SpecialSeries {
	public static void main(String[] args) {
		SpecialSeries aSpecialSeries = new SpecialSeries();

		double x = 0.1D;
		System.out.printf("Sum of the series: %.9f \n", aSpecialSeries.sumOfSeries(x, 5));
	}

	private double calculateTerm(double x, int numTerms) {
		double term = 1D;
		for (int i = (2 * numTerms + 1); i > 0; i--) {
			term *= x * (i % 2 == 0 ? 1 : i) / (i % 2 == 0 ? i : 1);
		}
		term /= 2 * (2 * numTerms + 1);
		return term;
	}

	private double sumOfSeries(double x, int numTerms) {
		if (x < -1D || x > 1D) {
			System.out.println("Please ensure what x value in range [-1; 1] and try again.");
			return 0D;
		}

		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += calculateTerm(x, i);
		}
		return result;
	}

}
