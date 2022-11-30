package ex2_9;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(4, 3, 7, 2, 1, 4);
		System.out.println(t1);
		System.out.println("Type of triangle 1 is " + t1.getType());
		System.out.printf("The perimeter of triangle is %.2f%n", t1.getPerimeter());
		
	}
}
