package ex1_5;

public class Cat extends Mammal {

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void greets() {
		System.out.println("Meow~");
	}

	public String toString() {
		return "Cat" + super.toString();
	}

}
