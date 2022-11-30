package com.patterns.strategies.execises;

public interface PayStrategy {
	boolean pay(int payAmount);
	void collectPaymentDetails();
}
