package ex1_1;

public class TestCylinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cld1 = new Cylinder();
		System.out.println("Cylinder" + " radius=" + cld1.getRadius() + " height=" + cld1.getHeight() + " base area="
				+ cld1.getArea() + " volume=" + cld1.getVolume());

		Cylinder cylinder2 = new Cylinder(10.0);
		System.out.println("Cylinder" + " radius=" + cylinder2.getRadius() + " height=" + cylinder2.getHeight()
				+ " base area=" + cylinder2.getArea() + " volume=" + cylinder2.getVolume());

		Cylinder cylinder3 = new Cylinder(2, 10);
		System.out.println("Cylinder" + " radius=" + cylinder3.getRadius() + " height=" + cylinder3.getHeight()
				+ " base area=" + cylinder3.getArea() + " volume=" + cylinder3.getVolume());
		
		System.out.println(cylinder3);
		System.out.println(cylinder3.getArea());
	}

}
