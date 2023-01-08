package oopprinciples.inheritance;

public class Dog extends Animals {
	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	public void bark() {
		System.out.println("Woof!");
	}
}
