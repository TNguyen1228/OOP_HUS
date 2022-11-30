package com.patterns.strategies.pseudocode;

public class ConcreteStrategyAdd implements Strategy {
	public int execute(int a, int b) {
		return a+b;
	}
}
