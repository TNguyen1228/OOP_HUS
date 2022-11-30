package ex1_5;

import ex1_2.GeometricObject;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geomObj1 = new Circle(5.0);
		System.out.println(geomObj1);
		System.out.println("Perimeter = " + geomObj1.getPerimeter());
		System.out.println("Area = " + geomObj1.getArea());
	}

}
