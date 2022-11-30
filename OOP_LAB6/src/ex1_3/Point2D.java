package ex1_3;

public class Point2D {
	private float x;
	private float y;

	public Point2D() {
		// TODO Auto-generated constructor stub
		x = 0.0f;
		y = 0.0f;
	}

	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;

	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float[] getXY() {
		float[] n = { this.x, this.y };
		return n;
		
	}

	public void setXY(Float x, float y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
