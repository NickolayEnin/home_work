package ru.otus.basic.lesson16;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<Contact>> phoneBook = new HashMap<>();

    public void add(String firstName, Contact contact) {
        phoneBook.compute(firstName, (key, val) -> val.add(contact)); //команда add должна же по идее срабатывать или я что-то напутал и
                                                                    //в SET же этой командой добавляются элементы или структура в целом должна быть другой?
        System.out.println(phoneBook);
    }

    public List<Contact> find(String name) {
        for (Map.Entry<String, Set<Contact>> entry : phoneBook.entrySet()) {
            List<Contact> contacts = new ArrayList<>();
            if (name.equals(entry.getKey())) {
                contacts.addAll(entry.getValue());
                System.out.println(contacts);
            }
            return contacts;
        }

        return null;
    }


    public boolean containsPhoneNumber(Integer num) {
        for (Map.Entry<String, Set<Contact>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(new Contact(num))) {
                return true;
            }
        }
        return false;
    }

}



