package com.oop.collections.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook{
    HashMap<String,Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.phone, p);
    }

    @Override
    public Student searchByName(String name) {
        for (Map.Entry<String,Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().name.equals(name))
                return entry.getValue();
        }
        return null;
    }

    @Override
    public Student searchByLastName(String name) {
        for (Map.Entry<String,Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().lastname.equals(name))
                return entry.getValue();
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
