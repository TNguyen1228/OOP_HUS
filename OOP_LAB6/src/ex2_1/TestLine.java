package ex2_1;

public class TestLine {
	public static void main(String[] args) {
		Point point1 = new Point(5, 6);
		Point point2 = new Point(10, 12);
		Line line1 = new Line(point1, point2);
		System.out.println(line1.getBeginX());
		System.out.printf("Length of line is %.2f%n", line1.getLength());
		System.out.printf("Gradient of line is %.2f%n", line1.getGradient());
		System.out.println(line1);
	}
}
