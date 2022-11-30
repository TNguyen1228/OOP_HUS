package abstractfactory.example.factory;

import abstractfactory.example.shape.RoundedRectangle;
import abstractfactory.example.shape.RoundedSquare;
import abstractfactory.example.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}
}