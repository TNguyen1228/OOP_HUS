package com.oop.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
	ArrayList<Student> phoneBook;

	public PhoneBookList() {
		phoneBook = new ArrayList<>();
	}

	@Override
	public void addPerson(Student p) {
		phoneBook.add(p);
	}

	@Override
	public Student searchByName(String name) {
		for (Student st : phoneBook) {
			if (st.name.equals(name)) {
				return st;
			}
		}
		return null;
	}

	@Override
	public Student searchByLastName(String name) {
		for (int i = 0; i < phoneBook.size(); i++) {
			if (phoneBook.get(i).lastname.equals(name))
				return phoneBook.get(i);
		}
		return null;
	}

	@Override
	public Student searchByNumber(String phone) {
		for (int i = 0; i < phoneBook.size(); i++) {
			if (phoneBook.get(i).phone.equals(phone))
				return phoneBook.get(i);
		}
		return null;
	}

	@Override
	public void deleteByNumber(String phone) {
		for (int i = 0; i < phoneBook.size(); i++) {
			if (phoneBook.get(i).lastname.equals(phone))
				phoneBook.remove(i);
		}
	}
}
