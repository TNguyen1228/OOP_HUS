package ex2_6;

public class TestPoint {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		MyPoint p2 = new MyPoint(5, 6);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance());
		p1.setXY(6, 8);
		System.out.println(p1.getXY()[0]);
		System.out.println(p1.getXY()[1]);
		System.out.println(p2.distance());
	}
}
