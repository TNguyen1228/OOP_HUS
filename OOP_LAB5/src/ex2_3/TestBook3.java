package ex2_3;

public class TestBook3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1 = new Author("Tim Marshall", "timms@aspect.com");
		System.out.println(author1);

		author1.setEmail("tim_marshall@gmail.com");
		System.out.println(author1);
		System.out.println("Name is: " + author1.getName());
		System.out.println("Email: " + author1.getEmail());
		Book3 book1 = new Book3("A311", "Java not for human", author1, 8.0, 8);
		System.out.println(book1.getAuthorName());
	}

}
