package ex1_4;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Shape();
		s1.setColor("red");
		System.out.println(s1);
		
		Shape s2=new Shape("blue", false);
		System.out.println(s2);
	}

}
