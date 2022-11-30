package ex1_5;

public class Dog extends Mammal {

	public Dog(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void greets() {
		System.out.println("WOOF");
	}

	public void greets(Dog another) {
		System.out.println("WOOOOOOF");
	}

	public String toString() {
		return "Dog" + super.toString();
	}
}
