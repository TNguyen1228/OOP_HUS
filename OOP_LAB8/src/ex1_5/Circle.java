package ex1_5;

import ex1_2.GeometricObject;

public class Circle implements GeometricObject {

	protected double radius = 1.0;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
        return String.format("Circle[radius = %1$f]", radius);
    }
}