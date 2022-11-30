package ex1_5;

public class Mammal extends Animal {

	public Mammal(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public String toString() {
		return "[Mammal" + super.toString() + "]";
	}

}
