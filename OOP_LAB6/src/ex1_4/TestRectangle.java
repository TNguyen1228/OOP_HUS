package ex1_4;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rtg1 = new Rectangle(3.0, 2.0);
		System.out.println(rtg1);
		System.out.println("Area of rectangle: " + rtg1.getArea());
		System.out.println("Perimeter of rectangle: " + rtg1.getPerimeter());
		rtg1.setColor("blue");
		rtg1.setFilled(false);
		System.out.println(rtg1);

		Rectangle rtg2 = new Rectangle(4, 5, "red", false);
		System.out.println(rtg2);
	}

}
