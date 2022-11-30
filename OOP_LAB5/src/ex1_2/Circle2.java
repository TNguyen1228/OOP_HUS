package ex1_2;

public class Circle2 {
	private double radius;

	public Circle2() {
		radius = 1.0;
	}

	public Circle2(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public double getCircumference() {
		return this.radius * 2 * Math.PI;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}
