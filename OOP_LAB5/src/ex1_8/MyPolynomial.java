package ex1_8;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public double[] getCoeffs() {
		return coeffs;
	}

	public int getDegree() {
		return coeffs.length - 1;
	}

	public double evaluate(double x) {
		double polyValue = 0;
		for (int i = this.getDegree(); i >= 0; i--) {
			polyValue = polyValue * x + this.coeffs[i];
		}
		return polyValue;
	}

	public MyPolynomial add(MyPolynomial another) {
		MyPolynomial result = this;
		if (result.getDegree() < another.getDegree()) {
			result = another;
			another = this;
		}

		double[] resultCoeffs = result.getCoeffs();
		double[] anotherCoeffs = another.getCoeffs();
		for (int i = 0; i < resultCoeffs.length; i++) {
			if (i > anotherCoeffs.length - 1) {
				continue;
			}
			resultCoeffs[i] += anotherCoeffs[i];
		}
		return new MyPolynomial(resultCoeffs);
	}

	public MyPolynomial multiply(MyPolynomial another) {
		double[] resultCoeffs = new double[this.getDegree() + another.getDegree() + 1];
		double[] anotherCoeffs = another.getCoeffs();
		for (int i = 0; i < resultCoeffs.length; i++) {
			double tmp = 0.0;
			for (int j = 0; j <= i; j++) {
				if (j > coeffs.length - 1) {
					continue;
				}
				if (i - j > anotherCoeffs.length - 1) {
					continue;
				}
				tmp += coeffs[j] * anotherCoeffs[i - j];
			}
			resultCoeffs[i] = tmp;
		}
		return new MyPolynomial(resultCoeffs);
	}

	public String toString() {
		StringBuilder description = new StringBuilder();
		for (int i = this.getDegree(); i >= 0; i--) {
			description.append(this.coeffs[i]).append("x^").append(i).append(" + ");
		}
		description.delete(description.length() - 3, description.length());
		return description.toString();
	}
}
