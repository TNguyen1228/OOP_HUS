package ex2_4;

public class Invoice  {
	private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public int getCustomerID() {
		return customer.getId();
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public int getCusDiscount() {
		return customer.getDiscount();
	}

	public double getAmountAfterDiscount() {
		amount = amount - amount * getCusDiscount()/100;
		return amount;
	}

	public String toString() {
		return "Invoice[id=" + id + ", customer=" + getCustomerName() + "(" + getCustomerID() + ")" + "("
				+ getCusDiscount() + "%)" + ", amount=" + amount + "]";
	}
}
