package ex1_3;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rtg1 = new Rectangle(1.2f, 3.4f);
		System.out.println(rtg1);

		rtg1.setLength(5.6f);
		rtg1.setWidth(7.8f);

		System.out.println(rtg1);
		System.out.printf("Area is: %.2f%n", rtg1.getArea());
		System.out.printf("Perimeter is: %.2f%n", rtg1.getPerimeter());
	}

}
