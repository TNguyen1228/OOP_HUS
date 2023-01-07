package decorator.exercises2.toppingdecorator;

import decorator.exercises2.icecream.IceCream;

public abstract class ToppingDecorator implements IceCream {

    protected IceCream iceCream;

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
