package com.patterns.strategies.execises;

public class CreditCardValidator {
	public static boolean isValid(long num) {
		return (getSize(num) >= 13 && getSize(num) <= 16)
				&& (prefixMatched(num, 4) || prefixMatched(num, 5) || prefixMatched(num, 37) || prefixMatched(num, 6))
				&& ((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0);
	}

	public static boolean isValid(String num) {
		return isValid(Long.parseLong(num));
	}

	private static int sumOfDoubleEvenPlace(long num) {
		// TODO Auto-generated method stub
		int s = 0;
		String numString = num + " ";
		for (int i = getSize(num) - 2; i >= 0; i -= 2) {
			s += getDigit(Integer.parseInt(numString.charAt(i) + " ") * 2);
		}
		return s;
	}

	private static int getDigit(int i) {
		// TODO Auto-generated method stub
		if (i < 9) {
			return i;
		}
		return i / 10 + i % 10;
	}

	private static int sumOfOddPlace(long num) {
		// TODO Auto-generated method stub
		int s = 0;
		String numString = num + " ";
		for (int i = getSize(num) - 1; i >= 0; i -= 2) {
			s += Integer.parseInt(numString.charAt(i) + " ");
		}
		return s;
	}

	private static boolean prefixMatched(long num, int i) {
		// TODO Auto-generated method stub
		return getPrefix(num, getSize(i)) == i;
	}

	private static long getPrefix(long num, int size) {
		// TODO Auto-generated method stub
		if (getSize(num) > size) {
			String numString = num + "";
			return Long.parseLong(numString.substring(0, size));
		}
		return num;
	}

	private static int getSize(long num) {
		// TODO Auto-generated method stub
		String numString = num + "";
		return numString.length();
	}
}
