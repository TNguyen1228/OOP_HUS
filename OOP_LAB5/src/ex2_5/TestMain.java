package ex2_5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(11258, "John Borris", 'm');
		System.out.println(customer1);
		System.out.println("Gender: "+customer1.getGender());
		System.out.println("Name: "+ customer1.getName());
		System.out.println("ID: "+customer1.getId());
		
		Account acc1=new Account(112, customer1, 52200000);
		System.out.println(acc1);
		System.out.println("Customer account: "+ acc1.getCustomerName());
		acc1.deposit(15632);
		System.out.println(acc1);
		acc1.withdraw(200000);
		System.out.println(acc1);
	}

}
