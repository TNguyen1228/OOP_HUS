import java.util.Scanner;

public class InputValidation {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberIn;
		boolean isValid=false;
		do {
			System.out.print("Enter the number between 0-10 or 90-100: ");
			numberIn=scanner.nextInt();
			if ((numberIn>=0 &&numberIn<=10)||(numberIn>=90&&numberIn<=100)) {
				isValid=true;
				System.out.println("You have entered: "+numberIn);
			}
			else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid);
	}

}
