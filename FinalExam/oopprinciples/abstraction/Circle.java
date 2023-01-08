package oopprinciples.abstraction;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	// This is the implementation of the abstract method defined in the Shape class.
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
