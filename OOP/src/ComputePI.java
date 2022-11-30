
public class ComputePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		int MAX_DENOMINATOR = 100000000;
		for (int i = 1; i <= MAX_DENOMINATOR; i += 2) {
			if (i % 4 == 1) {
				sum += (double) 1 / i;
			} else if (i % 4 == 3) {
				sum -= (double) 1 / i;
			}
		}
		sum = sum * 4;
		System.out.println("Pi is " + sum);
	}

}
