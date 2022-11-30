package com.oop.collections.mylist;

public class MyArrayList extends MyAbstractList {
	private static final int initial_size = 16;
	Object[] elementsObjects;
	int size;

	public MyArrayList() {
		elementsObjects = new Object[initial_size];
		size = 0;
	}

	public void add(Object o) {
		if (size >= elementsObjects.length - 1) {
			enlarge();
		}
		elementsObjects[size++] = o;
	}

	public void add(Object o, int index) {
		if (size >= elementsObjects.length - 1) {
			enlarge();
		}
		try {
			checkBoundaries(index, size);
			for (int i = size; i >index; i--) {
				elementsObjects[i]=elementsObjects[i-1];
			}
			elementsObjects[index]=0;
			size++;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Can't add"+o+" at index"+index);
		}
	}

	public Object get(int index) {
		checkBoundaries(index, size - 1);
		return elementsObjects[index];
	}

	public void remove(int index) {
		try {
			checkBoundaries(index, size - 1);
			for (int i = index; i < size - 1; i++) {
				elementsObjects[i] = elementsObjects[i + 1];
			}
			size--;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Can't remove at index" + index);
		}
	}

	public int size() {
		return size;
	}

	void enlarge() {
		Object[] tmp = new Object[elementsObjects.length + 2];
		System.arraycopy(elementsObjects, 0, tmp, 0, elementsObjects.length);
	}

}
