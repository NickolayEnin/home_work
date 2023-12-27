package ru.otus.basic.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {
    int age;
    String name;

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static List<Employee> minAge(int minimalAge, List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (minimalAge > employees.get(i).getAge()) {
                employees.remove(i);
                i--;
            }
        }
        return employees;
    }

    public static List<String> nameReturn(List<Employee> employees) {
        List<String> name = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            name.add(employees.get(i).getName());
        }
        return name;
    }

    public static boolean averageAge(int age, List<Employee> employees) {
        int ageEmployees = 0;
        for (int i = 0; i < employees.size(); i++) {
            ageEmployees += employees.get(i).getAge();
        }
        int averageAge = ageEmployees / employees.size();
        if (averageAge > age) {
            return true;
        }
        return false;
    }
    public static List<Employee>youngestEmployee(List<Employee> employees) {
        int minAge = employees.get(1).getAge();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge()<minAge){
                minAge = employees.get(i).getAge();
            }
        }
        System.out.println(minAge);
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getAge()>minAge){
                employees.remove(i);
                i--;
            }
        }
        return employees;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}