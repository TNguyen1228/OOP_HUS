
public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		if (a <= 0 || b <= 0) {
			return -1;
		}
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(4, 14));
	}

}
