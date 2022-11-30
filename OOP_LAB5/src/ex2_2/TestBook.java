package ex2_2;

public class TestBook {
	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Kate Brown", "katy_br@gmail.com", 'f');
		authors[1] = new Author("Sky Luke", "luke_sky@gmail.com", 'm');
		Book2 javaBook2 = new Book2("Java not for human", authors, 19.99, 99);
		System.out.println(javaBook2);
	}
}
