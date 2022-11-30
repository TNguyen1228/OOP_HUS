package com.patterns.strategies.pseudocode;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context = new Context(new ConcreteStrategyAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new ConcreteStrategySubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new ConcreteStrategyMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
