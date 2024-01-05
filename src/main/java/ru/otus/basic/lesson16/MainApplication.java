package ru.otus.basic.lesson16;


public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("fasf",new Contact(2141244));
        phoneBook.add("fasf1",new Contact(2141244));
        phoneBook.add("fasf",new Contact(214124445));
        phoneBook.add("fasf2",new Contact(214124434));
        phoneBook.add("fasf",new Contact(2144423));
        System.out.println(phoneBook.containsPhoneNumber(2141244));
        System.out.println(phoneBook.find("fasf1"));
    }
}
