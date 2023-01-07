package builder.pseudocode;

import builder.pseudocode.builders.CarBuilder;
import builder.pseudocode.builders.CarManualBuilder;
import builder.pseudocode.cars.Car;
import builder.pseudocode.cars.Manual;
import builder.pseudocode.director.Director;

public class Application {
	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());

		CarManualBuilder manualBuilder = new CarManualBuilder();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getProduct();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}

}
