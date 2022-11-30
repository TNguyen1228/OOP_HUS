import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		final int SALARY_CEILING=6000;
		final double employee_rate_55_and_below=0.2;
		final double employer_rate_55_and_below=0.17;
		final double employee55to60=0.13;
		final double employer55to60=0.13;
		final double employee60to65=0.075;
		final double employer60to65=0.09;
		final double employee65above=0.05;
		final double employer65above=0.075;
		int salary;
		int age;
		int contributableSalary;
		double employeeContribution;
		double employerContribution;
		double totalContribution;
		System.out.println("Enter the monthly salary: ");
		salary=scanner.nextInt();
		while (salary!=-1) {
			System.out.println("Enter the age: ");
			age=scanner.nextInt();
			if (age<=55) {
				employeeContribution=salary*employee_rate_55_and_below;
				employerContribution=salary*employer_rate_55_and_below;
			} else if (age <=60) {
				employeeContribution=salary*employee55to60;
				employerContribution=salary+employer55to60;
			} else if (age <=65) {
				employeeContribution=salary*employee60to65;
				employerContribution=salary*employer60to65;
			} else {
				employeeContribution=salary*employee65above;
				employerContribution=salary*employer65above;
			}
			totalContribution=employeeContribution+employerContribution;
			System.out.printf("The employee’s contribution is: %.2f%n",employeeContribution);
			System.out.printf("The employer’s contribution is: %.2f%n",employerContribution);
			System.out.printf("The total contribution is: %.2f%n", totalContribution);
		}
		System.out.println("DONE!");
	}
}
