package com.oop.library;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String lastname;
	String name;
	double average;
	String phoneString;

	public Student(String firstname, String lastname, String phone) {
		this.name = firstname;
		this.lastname = lastname;
		this.phoneString = phone;
	}

	public Student(String firstname, String lastname, double average) {
		this.name = firstname;
		this.lastname = lastname;
		this.average = average;
	}

	public Student(String name, String lastname, String phone, double average) {
		this.name = name;
		this.lastname = lastname;
		this.average = average;
		this.phoneString = phone;
	}

	public int compareTo(Student S) {
		return Double.compare(average, S.average);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return Double.compare(student.average, average) == 0 && Objects.equals(name, student.name)
				&& Objects.equals(lastname, student.lastname) && Objects.equals(phoneString, student.phoneString);
	}

	public int hashCode() {
		return Objects.hash(name, lastname, phoneString, average);
	}

	public String toString() {
		return "Student[" + "name=" + name + '\'' + ", lastname=" + lastname + '\'' + ", phone=" + phoneString + '\''
				+ ", average=" + average + "]";
	}
}
