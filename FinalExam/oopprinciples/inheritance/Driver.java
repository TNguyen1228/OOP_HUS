package oopprinciples.inheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a "Dog" object called "myDog" and call its "eat" and "bark" methods
		Dog myDog = new Dog("Fido", 5, "Labrador");
		myDog.eat(); 
		myDog.bark(); 

		//Assign the "myDog" object to a variable of type "Animal," because the "Dog" class extends the "Animal" class,
		//allows to call the "eat" method on the "myAnimal" object, even though it is actually a "Dog" object.
		Animals myAnimal = myDog;
		myAnimal.eat(); 

	}

}
