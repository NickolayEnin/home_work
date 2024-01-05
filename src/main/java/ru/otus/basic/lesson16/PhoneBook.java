package ru.otus.basic.lesson16;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<Contact>> phoneBook = new HashMap<>();

    public void add(String firstName, Contact contact) {
        if (!phoneBook.containsKey(firstName)) {
            phoneBook.put(firstName, new HashSet<Contact>());
        }
        phoneBook.get(firstName).add(contact);
    }

    public List<Contact> find(String name) {
        for (Map.Entry<String, Set<Contact>> entry : phoneBook.entrySet()) {
            List<Contact> contacts = new ArrayList<>();
            if (name.equals(entry.getKey())) {
                for (Contact number : entry.getValue()) {
                    contacts.add(number);
                    System.out.println(number.getNumber());
                }
                return contacts;
            }
        }
        return null;
    }


    public boolean containsPhoneNumber(int num) {
        for (Map.Entry<String, Set<Contact>> entry : phoneBook.entrySet()) {
            for (Contact contact : entry.getValue()) {
                int num1 = contact.getNumber();
                if (num1 == num) {
                    return true;
                }
            }
        }
        return false;
    }

}


