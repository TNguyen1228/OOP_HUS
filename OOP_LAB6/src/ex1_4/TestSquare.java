package ex1_4;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq1 = new Square(3);
		System.out.println(sq1);
		System.out.println("Area of square: " + sq1.getArea());
		System.out.println("Perimeter of square: " + sq1.getPerimeter());

		Square sq2 = new Square(4, "blue", false);
		System.out.println(sq2);
		sq2.setSide(5);
		System.out.println("Area of new Square=" + sq2.getArea());
	}

}
