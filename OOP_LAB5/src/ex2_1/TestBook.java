package ex2_1;


public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck); // Author's toString()
		Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
		System.out.println(dummyBook); // Test Book's toString()
		// Test Getters and Setters
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor()); // Author's toString()
		System.out.println("Author's name is: " + dummyBook.getAuthor().getNameString());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmailString());
		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);
	}

}
