package ex1_6;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("H121", "Leil Lowndes", 88);
		System.out.println(acc1);
		Account acc2 = new Account("H123", "Kate Brown");
		System.out.println(acc2);

		System.out.println("Id acc1: " + acc1.getId());
		System.out.println("Name acc1: " + acc1.getName());
		System.out.println("Balance acc1: " + acc1.getBalance());

		acc1.credit(100);
		System.out.println(acc1);
		acc1.debit(50);
		System.out.println(acc1);
		acc1.debit(500);
		System.out.println(acc1);

		acc1.tranferTo(acc2, 123);
		System.out.println(acc1);
		System.out.println(acc2);
	}

}
