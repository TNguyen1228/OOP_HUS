package ex2_7;

public class TestLine {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(5, 6);
		MyPoint point2 = new MyPoint(10, 12);
		MyLine line1 = new MyLine(point1, point2);
		System.out.println(line1.getBeginX());
		System.out.printf("Length of line is %.2f%n", line1.getLength());
		System.out.printf("Gradient of line is %.2f%n", line1.getGradient());
		System.out.println(line1);
	}
}
