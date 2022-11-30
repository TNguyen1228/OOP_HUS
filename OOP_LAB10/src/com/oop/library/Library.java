package com.oop.library;

public class Library {
	Rent[] rents;

	public Library(Rent[] rents) {
		this.rents = rents;
	}

	public Rent getLongestrent() {
		long longest = 0;
		Rent longestRent = null;
		for (Rent rent : rents) {
			long time = rent.end.getTime() - rent.beginDate.getTime();
			if (time > longest) {
				longest = time;
				longestRent = rent;
			}
		}
		return longestRent;
	}
}
