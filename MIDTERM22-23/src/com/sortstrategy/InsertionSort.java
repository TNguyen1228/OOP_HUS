package com.sortstrategy;

public class InsertionSort implements ISort {
	public InsertionSort() {

	}

	public int sort(int[] data) {
		int time = 0;
		for (int i = 1; i < data.length; i++) {
			int key = data[i];
			int j = i - 1;
			while (j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				time++;
				j--;
			}
			data[j + 1] = key;

		}

		return time;
	}
}
