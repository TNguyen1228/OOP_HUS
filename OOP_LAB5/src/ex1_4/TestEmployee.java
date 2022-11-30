package ex1_4;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(8, "Peter", "Parker", 5200);
		System.out.println(emp1);
		System.out.println("The annual salary is: " + emp1.getAnnualSalary());
		System.out.println(emp1.raiseSalary(10));
		System.out.println(emp1);
	}

}
