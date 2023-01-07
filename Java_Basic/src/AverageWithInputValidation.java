import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		final int num_students=3;
		int numberIn;
		boolean isValid;
		int sum=0;
		double average;
		for (int i = 1; i <= num_students; i++) {
			isValid=false;
			do {
				System.out.print("Enter the mark for student "+i+" : ");
				numberIn=scanner.nextInt();
				if (numberIn>=0 &&numberIn<=100) {
					isValid=true;
				}
				else {
					System.out.println("Invalid mark, try again...");
				}
			} while (!isValid);
		sum+=numberIn;
		}
		scanner.close();
		average=(double)sum/num_students;
		System.out.println("The average is: "+average);
	}

}
