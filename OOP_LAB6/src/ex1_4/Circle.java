package ex1_4;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double r) {
		super();
		this.radius = r;
	}

	public Circle(double r, String c, boolean f) {
		super(c, f);
		this.radius = r;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle" + super.toString() + ", radius=" + radius + "]";
	}
}
