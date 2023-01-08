package com.vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
	private List<Double> data;

	public ListVector() {
		/* TODO */
		data = new ArrayList<>();
		if (data == null) {
			throw new RuntimeException("Error initializing data field.");
		}
	}

	public ListVector(List<Double> data) {
		/* TODO */
		if (data == null) {
			throw new IllegalArgumentException("Data cannot be null.");
		}
		this.data = data;

	}

	@Override
	public void append(double value) {
		/* TODO */
		data.add(value);
	}

	@Override
	public void insert(double value, int index) {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		if (index < 0 || index > length()) {
			throw new IndexOutOfBoundsException("Index out of range.");
		}
		data.add(index, value);
	}

	@Override
	public void remove(int index) {
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		if (index < 0 || index >= length()) {
			throw new IndexOutOfBoundsException("Index out of range.");
		}
		data.remove(index);
	}

	@Override
	public int length() {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		return data.size();

	}

	@Override
	public double magnitude() {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		double sum = 0;
		for (double value : data) {
			sum += value * value;
		}
		return Math.sqrt(sum);

	}

	public double distanceTo(ListVector another) {
		/* TODO */
		if (data == null || another == null || another.data == null || data.size() != another.data.size()) {
			throw new IllegalArgumentException("Vectors are invalid or have different sizes.");
		}
		double sum = 0;
		for (int i = 0; i < data.size(); i++) {
			double diff = data.get(i) - another.data.get(i);
			sum += diff * diff;
		}
		return Math.sqrt(sum);
	}

	@Override
	public double[] elements() {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		double[] elements = new double[data.size()];
		for (int i = 0; i < data.size(); i++) {
			elements[i] = data.get(i);
		}
		return elements;
	}

	public double element(int index) {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		if (index < 0 || index >= data.size()) {
			throw new IndexOutOfBoundsException("Index out of range.");
		}
		return data.get(index);
	}

	public ListVector minus(ListVector another) {
		/* TODO */
		if (data == null || another == null || another.data == null || data.size() != another.data.size()) {
			throw new IllegalArgumentException("Vectors are invalid or have different sizes.");
		}
		List<Double> resultData = new ArrayList<>(data.size());
		for (int i = 0; i < data.size(); i++) {
			resultData.add(data.get(i) - another.data.get(i));
		}
		return new ListVector(resultData);
	}

	public ListVector plus(ListVector another) {
		/* TODO */
		if (data == null || another == null || another.data == null || data.size() != another.data.size()) {
			throw new IllegalArgumentException("Vectors are invalid or have different sizes.");
		}
		List<Double> resultData = new ArrayList<>(data.size());
		for (int i = 0; i < data.size(); i++) {
			resultData.add(data.get(i) + another.data.get(i));
		}
		return new ListVector(resultData);
	}

	public ListVector scale(double factor) {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		List<Double> resultData = new ArrayList<>(data.size());
		for (double value : data) {
			resultData.add(value * factor);
		}
		return new ListVector(resultData);
	}

	public double dot(ListVector another) {
		/* TODO */
		if (data == null || another == null || another.data == null || data.size() != another.data.size()) {
			throw new IllegalArgumentException("Vectors are invalid or have different sizes.");
		}
		double sum = 0;
		for (int i = 0; i < data.size(); i++) {
			sum += data.get(i) * another.data.get(i);
		}
		return sum;
	}

	/*
	 * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
	 */
	@Override
	public String toString() {
		/* TODO */
		if (data == null) {
			throw new IllegalStateException("Data list is not initialized.");
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < data.size(); i++) {
			sb.append(data.get(i));
			if (i < data.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
