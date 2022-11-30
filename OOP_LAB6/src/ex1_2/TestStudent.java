package ex1_2;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Kate Trump", "102 Square Town", "Data Science", 2011, 15000);
		System.out.println(student1);
		student1.setFee(20000);
		student1.setProgram("Computer Science");
		System.out.println(student1);
		System.out.println("Address: " + student1.getAddress());
		System.out.println("Program: " + student1.getProgram());
	}

}
