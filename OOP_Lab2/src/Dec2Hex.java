import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int n = Integer.parseInt(sc.next());
		System.out.println("The equivalent hexadecimal number is: " + Integer.toHexString(n));
		sc.close();
	}

}
