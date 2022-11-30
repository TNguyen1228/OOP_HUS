package com.oop.library;

public class Dvd extends Item {
	int duration;

	public Dvd(String titString, int ye, int dura) {
		super(titString, ye);
		this.duration = dura;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String toString() {
		return "DVD[duration=" + duration + ", title=" + title + '\'' + ", year=" + year + ']';
	}
	
}
