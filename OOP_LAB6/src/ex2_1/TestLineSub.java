package ex2_1;

public class TestLineSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineSub ls1 = new LineSub(1, 3, 4, 5);
		System.out.println(ls1);
		System.out.printf("Length of line: %.2f%n", ls1.getLength());
		ls1.setBeginX(2);
		System.out.println(ls1);
		System.out.printf("Gradient of line: %.3f%n", ls1.getGradient());

		LineSub aLine2 = new LineSub(new Point(0, 0), new Point(3, 4));
		System.out.println(aLine2);
		System.out.println("Line 2 begin is " + aLine2.getBegin());
		System.out.println("Line 2 end is " + aLine2.getEnd());
		System.out.println("Line 2 begin X is " + aLine2.getBeginX());
		System.out.println("Line 2 begin Y is " + aLine2.getBeginY());
		System.out.println("Line 2 end X is " + aLine2.getEndX());
		System.out.println("Line 2 end Y is " + aLine2.getEndY());
		System.out.println("Line 2 length is " + aLine2.getLength());
		System.out.printf("Line 2 gradient is %.2f%n", aLine2.getGradient());
		System.out.println("=====================");

		System.out.println("Change line 2 params...");
		aLine2.setBeginXY(2, 2);
		aLine2.setEndXY(5, 6);
		System.out.println("Line 2 begin is " + aLine2.getBegin());
		System.out.println("Line 2 end is " + aLine2.getEnd());
		System.out.println("Line 2 length is " + aLine2.getLength());
		System.out.printf("Line 2 gradient is %.2f%n", aLine2.getGradient());
		System.out.println("=====================");
	}

}
