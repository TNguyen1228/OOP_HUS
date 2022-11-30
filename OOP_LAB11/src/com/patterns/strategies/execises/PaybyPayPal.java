package com.patterns.strategies.execises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PaybyPayPal implements PayStrategy {
	private static final Map<String, String> DATA_BASE = new HashMap<>();
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private String email;
	private String password;
	private boolean signedIn;

	static {
		DATA_BASE.put("amanda1985", "amanda@ya.com");
		DATA_BASE.put("qwerty", "john@amazon.eu");
	}

	@Override
	public boolean pay(int payAmount) {
		// TODO Auto-generated method stub
		if (signedIn) {
			System.out.println("Paying " + payAmount + " using PayPal.");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void collectPaymentDetails() {
		// TODO Auto-generated method stub
		try {
			while (!signedIn) {
				System.out.print("Enter the user's email: ");
				email = READER.readLine();
				System.out.print("Enter the password: ");
				password = READER.readLine();
				if (verify()) {
					System.out.println("Data verification has been successful.");
				} else {
					System.out.println("Wrong email or password!");
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	private void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}

	private boolean verify() {
		setSignedIn(email.equals(DATA_BASE.get(password)));
		return signedIn;
	}
}
