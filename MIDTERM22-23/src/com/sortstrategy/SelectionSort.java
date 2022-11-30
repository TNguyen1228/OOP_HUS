package com.sortstrategy;

public class SelectionSort implements ISort {
	public SelectionSort() {
	}

	public int sort(int[] data) {
		int time = 0;
		for (int i = 0; i < data.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[minIdx]) {
					minIdx = j;
				}
			}
			int temp = data[minIdx];
			data[minIdx] = data[i];
			data[i] = temp;
			time++;
		}
		return time;
	}

}
