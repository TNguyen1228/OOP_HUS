package ex2_10;

public class Rectangle {
	private MyPoint topLeft;
	private MyPoint botRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		topLeft = new MyPoint(x1, y1);
		botRight = new MyPoint(x2, y2);
	}

	public Rectangle(MyPoint topLeft, MyPoint botRight) {
		this.topLeft = topLeft;
		this.botRight = botRight;
	}

	public String toString() {
		return "Triangle[" + topLeft.toString() + "," + botRight.toString() + "]";
	}

	public double getPerimeter() {
		return 2 * (Math.abs(topLeft.getX() - botRight.getX()) + Math.abs(topLeft.getY() - botRight.getY()));
	}

	public double getArea() {
		return Math.abs(topLeft.getX() - botRight.getX()) * Math.abs(topLeft.getY() - botRight.getY());
	}

	public String checkSquare() {
		if (Math.abs(topLeft.getX() - botRight.getX()) == Math.abs(topLeft.getY() - botRight.getY())) {
			return "This is Square";
		} else {
			return "Not a square";
		}
	}

}
