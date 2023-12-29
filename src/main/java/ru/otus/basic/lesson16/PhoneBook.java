package ru.otus.basic.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("Ivanov", new Contact(12312312));
        add("Ivanov", new Contact(123123));
        find("Ivanov", phoneBook);
        containsPhoneNumber(123123, phoneBook);
    }

    public static void add(String firstName, Contact contact) {
        if (!phoneBook.containsKey(firstName)) {
            phoneBook.put(firstName, new ArrayList<Contact>());
        }
        phoneBook.get(firstName).add(contact);
    }

    public static void find(String name, Map<String, List<Contact>> phoneBook) {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            if (name.equals(entry.getKey())) {
                System.out.print(name + ": ");
                for (Contact number : entry.getValue()) {
                    System.out.print(number.getNumber() + "; ");
                }
            } else {
                System.out.println("такого контакта не существует");
            }
            System.out.println();
        }
    }

    public static void containsPhoneNumber(int num, Map<String, List<Contact>> phoneBook) {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            for (Contact contact : entry.getValue()) {
                int num1 = contact.getNumber();
                if (num1 == num) {
                    System.out.println("номер есть");
                    break;
                }
                System.out.println("213");
            }

        }
    }
}


