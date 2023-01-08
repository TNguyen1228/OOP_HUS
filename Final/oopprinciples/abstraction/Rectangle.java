package oopprinciples.abstraction;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// This is the implementation of the abstract method defined in the Shape class.
	@Override
	public double getArea() {
		return width * height;
	}
}
