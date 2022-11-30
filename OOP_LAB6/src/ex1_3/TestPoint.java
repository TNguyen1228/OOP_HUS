package ex1_3;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D point3d1 = new Point3D(3, 4, 5);
		System.out.println(point3d1);
		point3d1.setXYZ(2, 3, 1);
		System.out.println(point3d1);

		Point2D point2d1 = new Point2D(3, 4);
		System.out.println(point2d1);
		point2d1.setXY(1.0f, 2.0f);
		System.out.println(point2d1);
	}

}
