package com.patterns.adapter.example;

public class BirdAdapter implements ToyDuck {
	Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		// TODO Auto-generated method stub
		bird.makesound();
	}

}
