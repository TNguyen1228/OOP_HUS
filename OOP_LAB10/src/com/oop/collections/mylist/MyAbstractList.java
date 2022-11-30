package com.oop.collections.mylist;

public abstract class MyAbstractList implements MyList {
	void checkBoundaries(int index, int limit) {
		if (index < 0 || index > limit) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sBuilder.append(String.format("[%s]", get(i).toString()));
		}
		return sBuilder.toString();
	}
}
