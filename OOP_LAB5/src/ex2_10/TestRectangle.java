package ex2_10;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint tl = new MyPoint(3, 2);
		MyPoint br = new MyPoint(1, 5);
		Rectangle rtg1 = new Rectangle(tl, br);
		System.out.println(rtg1.toString());
		System.out.println("The perimeter of rectangle 1 is " + rtg1.getPerimeter());
		System.out.println("The area of rectangle 1 is " + rtg1.getArea());
		Rectangle rtg2=new Rectangle(3,4,5,6);
		System.out.println(rtg2.checkSquare());
	}

}
