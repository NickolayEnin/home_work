package ru.otus.basic.lesson15;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
//        System.out.println(arrListMinMax(-21,10));
//        List<Integer> list = new ArrayList<>();
//        list = arrListMinMax(1, 7);
//        System.out.println(list);
//        sum5(list);
//        changeNumber(2, list);
//        upNumber(2, list);
        Map<Integer, String> employees = new HashMap<>();
        employees.put(25, "Fedor");
        employees.put(26, "Petr");
        employees.put(39, "Ivan");
        employees.put(45, "Igor");
//        System.out.println(minAge(26, employees));
//        System.out.println(nameReturn(employees));
        System.out.println(averageAge(50, employees));

    }

    public static boolean averageAge(int age, Map<Integer, String> employees) {
        int ageEmployees = 0;
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            ageEmployees += entry.getKey();
        }
        int averageAge = ageEmployees / employees.size();
        if (averageAge > age) {
            return true;
        }
        return false;
    }

    public static Map<Integer, String> minAge(int minimalAge, Map<Integer, String> employees) {
        for (Iterator<Map.Entry<Integer, String>> it = employees.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getKey() < minimalAge) {
                it.remove();
            }
        }
        return employees;
    }

    public static List<String> nameReturn(Map<Integer, String> employees) {
        List<String> name = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            name.add(entry.getValue());
        }
        return name;
    }

    public static List<Integer> arrListMinMax(int min, int max) {
        List<Integer> values = new ArrayList<>();
        for (int e = min; e <= max; e++) {
            values.add(e);
        }
        return values;

    }


    public static void sum5(List<Integer> values) {
        int sum = 0;
        for (Integer s : values) {
            if (s > 5) {
                sum += s;
            }
        }
        System.out.println(sum);
    }

    public static void changeNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println(list);
    }

    public static void upNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        System.out.println(list);
    }

    class Employee {
        private Integer age;
        private String name;

    }

}
