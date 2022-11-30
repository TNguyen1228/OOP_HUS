package ex1_2;

public class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		// TODO Auto-generated constructor stub
		this.address = address;
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "[Person[name=" + name + ", address=" + address + "]]";
	}
}
