public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			sum += number;
		}
		average = (double) sum / UPPERBOUND;
		System.out.println("Sum is " + sum + " and average is " + average);
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			if (number % 2 == 0) {
				sumOdd += number;
			} else {
				sumEven += number;
			}
		}
		if (sumOdd > sumEven) {
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}
		System.out.println(absDiff);
	}

}
