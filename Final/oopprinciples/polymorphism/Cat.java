package oopprinciples.polymorphism;

public class Cat extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Meow!");
	}

	public void meow(int numMeows) {
		for (int i = 0; i < numMeows; i++) {
			System.out.println("Meow!");
		}
	}
}
