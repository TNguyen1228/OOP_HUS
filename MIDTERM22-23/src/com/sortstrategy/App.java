package com.sortstrategy;

import java.util.Random;

public class App {
	public App() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[5];
		Random rdRandom = new Random();
		for (int i = 0; i < 5; i++) {
			data[i] = rdRandom.nextInt(10);
		}
		System.out.print("Before sorting: ");
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				System.out.print("[" + i);
			} else if (i == data.length - 1) {
				System.out.print(" " + i + "]");
			} else {
				System.out.print(" " + i);
			}
		}
		System.out.println();
		System.out.print("After sorting: ");
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				System.out.print("[" + i);
			} else if (i == data.length - 1) {
				System.out.print(" " + i + "]");
			} else {
				System.out.print(" " + i);
			}
		}
		BubbleSort bbsBubbleSort=new BubbleSort();
		int time = bbsBubbleSort.sort(data);
		System.out.println("Number of swap: " +time);

	}

}
