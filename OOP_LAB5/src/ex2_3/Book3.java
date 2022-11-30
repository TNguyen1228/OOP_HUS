package ex2_3;

public class Book3 {
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book3(String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book3(String isbn, String name, Author author, double price, int qty) {
		this(isbn, name, author, price);
		this.qty = qty;
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

	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String toString() {
		return "Book[isbn=" + isbn + ", name=" + name + "," 
				+ author.toString() + ", price=" + price + ", qty=" + qty + "]";
	}
}
