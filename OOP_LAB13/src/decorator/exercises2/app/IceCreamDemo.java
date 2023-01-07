package decorator.exercises2.app;


import decorator.exercises2.icecream.ChocolateIceCream;
import decorator.exercises2.icecream.IceCream;
import decorator.exercises2.icecream.StrawberryIceCream;
import decorator.exercises2.icecream.VanillaIceCream;
import decorator.exercises2.toppingdecorator.HoneyToppingDecorator;
import decorator.exercises2.toppingdecorator.NutsToppingDecorator;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoney = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(vanillaIceCreamWithHoney.getDescription());

        IceCream strawberryCreamWithNuts = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(strawberryCreamWithNuts.getDescription());

        IceCream chocolateIceCreamWithHoneyAndNuts = new NutsToppingDecorator(new HoneyToppingDecorator(new NutsToppingDecorator(new ChocolateIceCream())));
        System.out.println(chocolateIceCreamWithHoneyAndNuts.getDescription());
    }
}
