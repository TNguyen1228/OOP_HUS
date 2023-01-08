package oopprinciples.polymorphism;

public class Driver {
	public static void main(String[] args) {
		// create an instance of the "Dog" class and assign it to a variable of type
		// "Animal."
		// Do the same thing with the "Cat" class
		Animal dog = new Dog();
		Animal cat = new Cat();

		// call the "makeNoise" method on the "dog" and "cat" objects
		dog.makeNoise();
		cat.makeNoise();

		// call the "bark" method on the "dog" object, using type casting to explicitly
		// treat the "dog" object as a "Dog" object
		((Dog) dog).bark(3);
	}
}
