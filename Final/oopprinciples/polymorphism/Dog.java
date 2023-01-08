package oopprinciples.polymorphism;

public class Dog extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Woof!");
	}

	public void bark(int numBarks) {
		for (int i = 0; i < numBarks; i++) {
			System.out.println("Woof!");
		}
	}
}
