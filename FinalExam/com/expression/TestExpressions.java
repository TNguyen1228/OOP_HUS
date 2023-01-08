package com.expression;

public class TestExpressions {
	public static void main(String[] args) {
		/* TODO */
		/* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
		Evaluable one = new Constant(1);
		Evaluable two = new Constant(2);
		Evaluable three = new Constant(3);
		Evaluable four = new Constant(4);

		Operator addition = new AdditionOperator();
		Operator multiplication = new MultiplicationOperator();
		Operator subtraction = new SubtractionOperator();

		Expression innerExpression = new Expression(one, two, addition);
		Expression outerExpression = new Expression(innerExpression, three, multiplication);
		Expression finalExpression = new Expression(outerExpression, four, subtraction);

		double result = finalExpression.evaluate();
		System.out.println(result); // prints "5.0"
	}
}
