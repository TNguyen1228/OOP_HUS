package ex1_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> intersectionIntegers = new HashSet<>();
		for (Integer integer : first) {
			for (Integer integer2 : second) {
				if (integer == integer2) {
					intersectionIntegers.add(integer);
				}
			}
		}
		return intersectionIntegers;
	}

	public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> union = new HashSet<>();
		union.addAll(intersectionManual(first, second));
		for (Integer integer : union) {
			for (Integer integer2 : first) {
				if (integer != integer2) {
					union.add(integer2);
				}
			}
			for (Integer integer2 : second) {
				if (integer != integer2) {
					union.add(integer2);
				}
			}
		}
		return union;
	}

	public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
		Set<Integer> union = new HashSet<>(first);
		union.addAll(second);
		return union;
	}

	public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
		Set<Integer> intersection = new HashSet<>(first);
		intersection.retainAll(second);
		return intersection;
	}

	public static List<Integer> toList(Set<Integer> source) {
		return new ArrayList<>(source);
	}

	public static List<Integer> removeDuplicates(List<Integer> source) {
		return new ArrayList<>(new HashSet<>(source));
	}

	public static List<Integer> removeDuplicatesManual(List<Integer> source) {
		List<Integer> result = new ArrayList<>();
		for (Integer integer : source) {
			if (!result.contains(integer)) {
				result.add(integer);
			}
		}
		return result;
	}

	public static String firstRecurringCharacter(String s) {
		if (s == null || s.length() == 0) {
			return null;
		}
		Set<Character> result = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (result.contains(s.charAt(i))) {
				return String.valueOf(s.charAt(i));
			}
			result.add(s.charAt(i));
		}
		return s;

	}

	public static Set<Character> allRecurringChars(String s) {
		Set<Character> set = new HashSet<>();
		Set<Character> resultCharacters = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (set.contains(c)) {
				resultCharacters.add(c);
			} else {
				set.add(c);
			}
		}
		return resultCharacters;
	}

	public static Integer[] toArray(Set<Integer> source) {
		return source.toArray(new Integer[0]);
	}

	public static int getFirst(TreeSet<Integer> source) {
		return source.first();
	}

	public static int getLast(TreeSet<Integer> source) {
		return source.last();
	}

	public static int getGreater(TreeSet<Integer> source, int value) {
		return source.higher(value);
	}
}
