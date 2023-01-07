import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double radius;
		double diameter;
		double circumfer;
		double area;
		System.out.print("Enter the radius: ");
		radius = in.nextDouble();
		diameter = 2.0 * radius;
		area = Math.PI * radius * radius;
		circumfer = 2.0 * Math.PI * radius;
		System.out.printf("Diameter is: %.2f%n", diameter);
		in.close();
	}

}
