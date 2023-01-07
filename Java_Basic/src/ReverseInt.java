import java.util.Scanner;

public class ReverseInt {
	static Scanner scanner=new Scanner(System.in);

	public static void Reverse(int inNumber) {
		int inDigit;
		System.out.print("The reverse is: ");
		while (inNumber>0) {
			inDigit=inNumber%10;
			System.out.print(inDigit);
			inNumber/=10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int inNum;
		System.out.println("Enter the positive integer: ");
		inNum=scanner.nextInt();
		Reverse(inNum);	
		}
	}


