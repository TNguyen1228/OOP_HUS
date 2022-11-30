package com.oop.library;

import java.util.Date;

public class Rent {
	Item item;
	Student student;
	Date beginDate;
	Date end;

	public Rent(Item item, Student student, Date begin, Date end) {
		this.beginDate = begin;
		this.end = end;
		this.student = student;
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String toString() {
		return "Rent[item=" + item + ", student=" + student + ", begin=" + beginDate + ", end=" + end + "]";
	}
}
