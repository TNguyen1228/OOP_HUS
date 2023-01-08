package com.expression;

public class Constant implements Evaluable {
	private double value;

	public Constant(double value) {
		this.value = value;
	}

	@Override
	public double evaluate() {
		return value;
	}
}