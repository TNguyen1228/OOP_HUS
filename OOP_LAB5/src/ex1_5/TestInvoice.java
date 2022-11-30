package ex1_5;

public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceItem ivc1 = new InvoiceItem("A105", "Pen Red", 888, 0.08);
		System.out.println(ivc1);

		ivc1.setQty(999);
		ivc1.setUnitPrice(0.99);
		System.out.println(ivc1);
		System.out.println("ID is: " + ivc1.getId());
		System.out.println("The total is: " + ivc1.getTotal());
	}

}
