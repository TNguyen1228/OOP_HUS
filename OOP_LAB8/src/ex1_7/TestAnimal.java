package ex1_7;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		c1.greeting();
		Dog d1 = new Dog();
		d1.greeting();
		BigDog bd1 = new BigDog();
		bd1.greeting();

		Animal animal1 = new Cat();
		animal1.greeting();
		Animal animal2 = new Dog();
		animal2.greeting();
		Animal animal3 = new BigDog();
		animal3.greeting();
		//Animal animal4= new Animal(); // ERROR!!! Animal is abstract
		
		Dog dog2=(Dog) animal2;
		BigDog bigDog2=(BigDog) animal3;
		Dog dog3=(Dog) animal3; 
		//Cat cat2=(Cat) animal2; // Dog cannot be cast to Cat
		dog2.greeting(dog3);
		dog3.greeting(dog2);
		bigDog2.greeting(dog2);
		bigDog2.greeting(bd1);
	}

}
