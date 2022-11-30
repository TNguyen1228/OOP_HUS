package ex1_1;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		// TODO Auto-generated constructor stub
		super();
		width = 1.0;
		length = 1.0;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double w, double l, String c, boolean f) {
		super(c, f);
		this.width = w;
		this.length = l;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public String toString() {
		return "Rectangle[" + super.toString() + "], width=" + width + ", length=" + length;
	}
	
}
