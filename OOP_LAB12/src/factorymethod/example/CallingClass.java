package factorymethod.example;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitFactory factory = new FruitFactory();

		// Create Apple object using factory and call produceJuice method
		Fruit fruit = factory.provideFruit("apple");
		fruit.produceJuice();
		// Create Orange object using factory and call produceJuice method
		fruit = factory.provideFruit("orange");
		fruit.produceJuice();
		// Create Banana object using factory and call produceJuice method
		fruit = factory.provideFruit("pine");
		fruit.produceJuice();
	}

}
