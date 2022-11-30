package ex2_8;

public class TestCircle {
	public static void main(String[] args) {
		MyCircle circle1 = new MyCircle(1, 1, 2);
		MyPoint p2 = new MyPoint(3, 4);
		MyCircle circle2 = new MyCircle(p2, 3);
		System.out.println(circle2);
		System.out.println("X2=" + circle2.getCenterX());
		System.out.println("Y2=" + circle2.getCenterY());
		circle2.setCenterXY(3, 5);
		System.out.println(circle2);
		System.out.printf("Distance from 1 to 2 is %.2f%n", circle1.distance(circle2));
		System.out.printf("Area of circle 1 is %.2f%n", circle1.getArea());
		System.out.printf("Circumference of circle 2 is %.2f%n", circle2.getCircumference());
	}
}
