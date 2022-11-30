package ex2_1;

public class Author {
	private String nameString;
	private String emailString;
	private char gender;

	public Author(String name, String email, char gender) {
		this.nameString = name;
		this.emailString = email;
		this.gender = gender;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getNameString() {
		return nameString;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return "Author" + "[name: " + nameString + ", email: " + emailString + ", gender: " + gender+"]";
	}
}
