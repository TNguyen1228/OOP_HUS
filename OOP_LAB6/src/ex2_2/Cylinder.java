package ex2_2;

import ex1_4.Circle;

public class Cylinder {
	private Circle base;
	private double height;

	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Cylinder[radius=" + base.getRadius() + ", color=" + base.getColor() + ", height=" + height + "]";
	}
}
