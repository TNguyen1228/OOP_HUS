package ex1_1;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		// TODO Auto-generated constructor stub
		super();
		height = 1.0;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}

	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}

	@Override
	public double getArea() {
		return 2 * height * getRadius() * Math.PI + 2 * super.getArea();
	}

}
