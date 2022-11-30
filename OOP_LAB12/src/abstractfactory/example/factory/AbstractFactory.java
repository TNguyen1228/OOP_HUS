package abstractfactory.example.factory;

import abstractfactory.example.shape.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
}
