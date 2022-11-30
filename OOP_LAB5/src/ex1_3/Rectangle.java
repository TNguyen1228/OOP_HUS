package ex1_3;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

	public String toString() {
		return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
	}

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(24, 15);
		System.out.println(rectangle1.toString());
		System.out.println("Area is " + rectangle1.getArea() + " and Perimeter is " + rectangle1.getPerimeter());

	}
}
