package ex1_2;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st1 = new Staff("Huy", "101 Streetway", "HUS", 50);
		System.out.println(st1);
		System.out.println("Address: " + st1.getAddress());
		st1.setPay(50000);
		System.out.println("Pay: " + st1.getPay());
	}

}
