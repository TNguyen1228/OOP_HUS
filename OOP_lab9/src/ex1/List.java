package ex1;

import java.util.*;

public class List {
	public static void insertFirst(ArrayList<Integer> list, int value) {
		list.add(0, value);
	}

	public static void insertLast(ArrayList<Integer> list, int value) {
		insertFirst(list, value);
		Collections.reverse(list);
	}

	public static void replace(ArrayList<Integer> list, int value) {
		if (list == null || list.size() < 3) {
			return;
		}
		list.set(2, value);
	}

	public static void removeThird(ArrayList<Integer> list) {
		if (list == null || list.size() < 3) {
			return;
		}
		list.remove(2);
	}

	public static void removeEvil(ArrayList<Integer> list) {
		if (list == null) {
			return;
		}
		list.removeIf(i -> i == 666);
	}

	public static ArrayList<Integer> generateSquare() {
		/* TODO */
		ArrayList<Integer> listSquare = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			listSquare.add(i * i);
		}
		return listSquare;
	}

	public static boolean contains(ArrayList<Integer> list, int value) {
		/* TODO */
		if (list.contains(value)) {
			return true;
		}
		return false;
	}

	public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
		target.clear();
		Collections.copy(source, target);
	}

	public static void reverse(ArrayList<Integer> list) {
		Collections.reverse(list);
	}

	public static void reverseManual(ArrayList<Integer> list) {
		int size = list.size();
		int midIdx = list.size() / 2;
		for (int i = 0; i < midIdx; i++) {
			int temp;
			temp = list.get(i);
			list.set(i, list.get(size - 1 - i));
			list.set(size - i - 1, temp);
		}
	}

	public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
		list.addFirst(value);
		list.addLast(value);
	}


}
