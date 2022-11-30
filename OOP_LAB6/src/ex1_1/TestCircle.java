package ex1_1;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		System.out.println(c1);
		c1.setColor("blue");
		c1.setRadius(5.2);
		System.out.println(c1);
		System.out.printf("Area=%.2f%n", c1.getArea());
		
	}
}
