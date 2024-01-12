package ru.otus.basic.lesson16;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void add(String firstName, Contact contact) {  //если делать как вы прислали, то выдает ошибку при компиляции, а если сделать так, то он не создает новый контакт, не могу понять почему, ведь этот метод должен создавать если
                                                            //нет такого key или я неправильно понял работу этого метода?
        phoneBook.compute(firstName, (key, val) -> {
            if (val == null) {
                val = new ArrayList<>();
            }
            val.add(contact);
            return val;
        });
    }

    public List<Contact> find(String name) {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
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
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(new Contact(num))) {
                return true;
            }
        }
        return false;
    }

}



