package com.expression;

public class DivisionOperator implements Operator {
	@Override
	public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
		/* TODO */
		double right = rightOperand.evaluate();
		if (Math.abs(right) < 1e-10) {
			throw new ArithmeticException("Division by zero");
		}
		return leftOperand.evaluate() / right;
	}
}
