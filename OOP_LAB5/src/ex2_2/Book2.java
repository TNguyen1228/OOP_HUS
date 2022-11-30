package ex2_2;

import java.util.Arrays;

public class Book2 {
	private String name;
	private double price;
	private Author[] authors;
	private int qty = 0;

	public Book2(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book2(String name, Author[] authors, double price, int qtyInStock) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public String getAuthorNames() {
		String authorsName = "";
		for (int i = 0; i < authors.length - 1; i++) {
			authorsName += authors[i].getNameString() + ", ";
		}
		authorsName += authors[authors.length - 1].getNameString();
		return authorsName;
	}
	public String toString() {
		return "Book["+
				"name= " + name + ']' +
				", authors=" + Arrays.toString(authors) +
				", price=" + price +
				", qty=" + qty + ']';
	}
}
