package oopprinciples.abstraction;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(10);
		Shape rectangle = new Rectangle(10, 20);

		System.out.println(circle.getArea()); // Outputs: 314.16
		System.out.println(rectangle.getArea()); // Outputs: 200.0

	}

}
