package ru.enin.basic.lesson10;

public class User {
    private String firstName;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String email;
    private int age;

    public User(String firstName, String name, String surname, int yearOfBirth, String email) {
        this.firstName = firstName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;

    }


    public User(String firstName, String name, String surname, int yearOfBirth) {
        this.firstName = firstName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.email = "Unknown";
    }

    public int getAge() {
        age = 2023 - yearOfBirth;
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info() {
        System.out.println("FIO: " + firstName + " " + name + " " + surname);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }

}
