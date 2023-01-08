package com.vector;

import java.util.Arrays;
import java.util.List;

public class TestVectors {
	public static void main(String[] args) {
		/* TODO */
		double[] d = { 12.5, 14.9, 87.4, 55.8 };
		ArrayVector av = new ArrayVector(d);

		double[] d2 = { 2, 4, 5, 6,7.8};
		ArrayVector av2 = new ArrayVector(d2);

		System.out.println("d: " + av.toString());
		System.out.println("d2" + av2.toString());
		System.out.println("Length d: " + av.length());
		av.append(4.0);
		System.out.println("Elements (after append): " + av.toString());
		av.insert(2.0, 1);
		System.out.println("Elements (after insert): " + av.toString());
		av.remove(4);
		System.out.println("Elements (after remove): " + av.toString());
		System.out.println("Magnitude: " + av.magnitude());
		System.out.println("Distance from av to av2: " + av.distanceTo(av2));
		//System.out.println("Minus av with av2: " + av.minus(av2));
		System.out.println("Plus av with av2: " + av.plus(av2));
		System.out.println("Scale av with 3:" + av.scale(3));
		System.out.println("Dot av with av2: "+av.dot(av2));
		
		System.out.println();

		List<Double> data = Arrays.asList(1.0, 2.0, 3.0);
		ListVector v = new ListVector(data);
		System.out.println("Elements: " + Arrays.toString(v.elements()));
		System.out.println("Length: " + v.length());
		System.out.println("Magnitude: " + v.magnitude());
		/*v.append(4.0);
		System.out.println("Elements (after append): " + Arrays.toString(v.elements()));
		v.insert(0.5, 1);
		System.out.println("Elements (after insert): " + Arrays.toString(v.elements()));
		v.remove(1);
		System.out.println("Elements (after remove): " + Arrays.toString(v.elements()));
		data = Arrays.asList(4.0, 5.0, 6.0);
		ListVector w = new ListVector(data);
		System.out.println("Dot product: " + v.dot(w));
		System.out.println("Difference: " + v.minus(w));
		System.out.println("Sum: " + v.plus(w));
		System.out.println("Scaled: " + v.scale(2.0));
		*/
	}
}
