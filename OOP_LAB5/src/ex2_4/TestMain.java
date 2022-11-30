package ex2_4;

public class TestMain {
	public static void main(String[] args) {
		Customer customer1 = new Customer(88, "Tan Ah Tek", 10);
		System.out.println(customer1);
		System.out.println(customer1.getDiscount());
		Invoice ivc1 = new Invoice(101, customer1, 888.8);
		System.out.println(ivc1);
		ivc1.setAmount(999.9);
		System.out.println(ivc1);
		System.out.println("Customer id :"+ivc1.getCustomerID());
		System.out.println("Customer: "+ivc1.getCustomerName());
		System.out.printf("Amount after discount: %.2f%n", ivc1.getAmountAfterDiscount());
	}
}
