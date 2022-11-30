package ex1_3;

public class Point3D extends Point2D {
	private float z;

	public Point3D() {
		super();
		z = 0.0f;
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float[] getXYZ() {
		float[] n = { super.getX(), super.getY(), z };
		return n;
	}

	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}

	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")";
	}

}
