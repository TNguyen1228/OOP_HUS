package com.patterns.adapter.example;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Chirp chirp");
	}

}
