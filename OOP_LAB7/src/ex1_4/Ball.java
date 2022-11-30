package ex1_4;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;

	public Ball(int x, int y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
		this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	public float getxDelta() {
		return xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public void move() {
		x += xDelta;
		y += yDelta;
	}

	public void reflectHorizontal() {
		xDelta = -xDelta;
	}

	public void reflectVertical() {
		yDelta = -yDelta;
	}

	public int getSpeed() {
		return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
	}

	public int getDirection() {
		return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
	}

	public String toString() {
		return "Ball at (" + (int) x + ", " + (int) y + ") of velocity (" + getSpeed() + ", " + getDirection() + ")";
	}

}
