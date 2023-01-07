
public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=31434;
		while (n>0) {
			int digit=n%10;
			System.out.print(digit+ " ");
			n=n/10;
		}
	}

}
