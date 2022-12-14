package com.vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
	private double[] data;
	private int length;

	public ArrayVector() {
		data = new double[1];
	}

	public ArrayVector(double[] coefficients) {
		/* TODO */
		if (coefficients == null) {
			throw new IllegalArgumentException("Coefficients array cannot be null.");
		}
		data = Arrays.copyOf(coefficients, coefficients.length);
		length = data.length;
	}

	/*
	 * Hàm tăng số phần tử của mảng lên gấp đôi. Do mảng không thay đổi được số phần
	 * tử sau khi đã cấp phát, nên để tăng số phần tử của mảng, cần phải cấp phát
	 * lại mảng khác có số phần tử gấp đôi, sau đó copy những phần tử của mảng cũ
	 * sang mảng mới.
	 */
	private void extend() {
		data = Arrays.copyOf(data, data.length * 2);
	}

	/*
	 * Hàm thêm một phần tử vào cuối vector. Kiểm tra xem mảng còn chỗ để thêm phần
	 * tử mới không, nếu không còn chỗ thì cần phải cấp phát một mảng lớn hơn.
	 */
	@Override
	public void append(double value) {
		/* TODO */
		if (length == data.length) {
			extend();
		}
		data[length] = value;
		length++;
	}

	/*
	 * Hàm thêm một phần tử vào vector ở vị trí index. Kiểm tra xem mảng còn chỗ để
	 * thêm phần tử mới không, nếu không còn chỗ thì cần phải cấp phát một mảng lớn
	 * hơn.
	 */
	@Override
	public void insert(double value, int index) {
		/* TODO */
		if (index < 0 || index > length) {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}
		if (length == data.length) {
			extend();
		}
		for (int i = length; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = value;
		length++;
	}

	/*
	 * Hàm xóa một phần tử của vector ở vị trí index.
	 */
	@Override
	public void remove(int index) {
		/* TODO */
		if (index < 0 || index >= length) {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}
		for (int i = index; i < length - 1; i++) {
			data[i] = data[i + 1];
		}
		length--;
	}

	@Override
	public int length() {
		/* TODO */
		return length;
	}

	@Override
	public double magnitude() {
		/* TODO */
		double sum = 0;
		for (int i = 0; i < length; i++) {
			sum += data[i] * data[i];
		}
		return Math.sqrt(sum);

	}

	public double distanceTo(ArrayVector another) {
		/* TODO */
		if (another == null || another.length != length) {
			throw new IllegalArgumentException("Vector is invalid or has different size.");
		}
		double sum = 0;
		for (int i = 0; i < length; i++) {
			double diff = data[i] - another.data[i];
			sum += diff * diff;
		}
		return Math.sqrt(sum);
	}

	@Override
	public double[] elements() {
		/* TODO */
		return Arrays.copyOf(data, length);
	}

	@Override
	public double element(int index) {
		/* TODO */
		if (index < 0 || index >= length) {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}
		return data[index];
	}

	public ArrayVector minus(ArrayVector another) {
		/* TODO */
		if (another == null) {
			throw new IllegalArgumentException("Cannot subtract null vector.");
		}
		if (length != another.length) {
			throw new IllegalArgumentException("Cannot subtract vectors with different sizes.");
		}
		double[] result = new double[length];
		int i = 0;
		for (double coefficient : data) {
			result[i] = coefficient - another.data[i];
			i++;
		}
		return new ArrayVector(result);
	}

	public ArrayVector plus(ArrayVector another) {
		/* TODO */
		if (another == null || another.length != length) {
			throw new IllegalArgumentException("Vector is invalid or has different size.");
		}
		double[] result = new double[length];
		for (int i = 0; i < length; i++) {
			result[i] = data[i] + another.data[i];
		}
		return new ArrayVector(result);
	}

	public ArrayVector scale(double factor) {
		/* TODO */
		double[] result = new double[length];
		for (int i = 0; i < length; i++) {
			result[i] = data[i] * factor;
		}
		return new ArrayVector(result);
	}

	public double dot(ArrayVector another) {
		/* TODO */
		if (another == null || another.length != length) {
			throw new IllegalArgumentException("Vector is invalid or has different size.");
		}
		double sum = 0;
		for (int i = 0; i < length; i++) {
			sum += data[i] * another.data[i];
		}
		return sum;

	}

	/*
	 * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
	 */
	@Override
	public String toString() {
		/* TODO */
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < length; i++) {
			sb.append(data[i]);
			if (i < length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();

	}
}
