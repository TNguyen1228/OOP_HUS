package ex2_8;

public class MyCircle {
	private MyPoint center;
	private int radius = 1;

	public MyCircle() {
	}

	public MyCircle(int x, int y, int radius) {
		this.radius = radius;
		this.center = new MyPoint(x, y);
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		center.setX(x);
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		center.setY(y);
	}

	public int[] getCenterXY() {
		int center[] = { getCenterX(), getCenterY() };
		return center;
	}

	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}

	public String toString() {
		return "Circle[radius=" + radius + ", center=" + center.toString();
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return radius * 2 * Math.PI;
	}

	public double distance(MyCircle another) {
		return center.distance(another.getCenter());
	}
}
