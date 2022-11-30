package com.oop.library;

public class Book extends Item {
	int pages;

	public Book(String title, int year, int page) {
		super(title, year);
		this.pages = page;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String toString() {
		return "Book[Pages=" + pages + ", title=" + title + '\'' + ", year=" + year + ']';
	}
}
