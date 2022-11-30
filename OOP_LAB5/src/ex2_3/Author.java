package ex2_3;

public class Author {
	private String nameString;
	private String emailString;

	public Author(String name, String email) {
		this.nameString = name;
		this.emailString = email;

	}

	public String getEmail() {
		return emailString;
	}

	public void setEmail(String emailString) {
		this.emailString = emailString;
	}

	public String getName() {
		return nameString;
	}

	public String toString() {
		return "Author" + "[name: " + nameString + ", email: " + emailString + "]";
	}
}
