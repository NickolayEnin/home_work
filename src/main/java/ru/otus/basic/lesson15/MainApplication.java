package ru.otus.basic.lesson15;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list = arrListMinMax(1, 7);
        System.out.println(list);
        sum5(list);
        changeNumber(2, list);
        upNumber(2, list);
        employee.add(new Employee(25,"Viktor"));
        employee.add(new Employee(15,"Petr"));
        employee.add(new Employee(13,"Petr1"));
        employee.add(new Employee(45,"Petr2"));
        employee.add(new Employee(10,"Vasya"));
        System.out.println(employee);
        System.out.println(Employee.nameReturn(employee));
        System.out.println(Employee.minAge(16,employee));
        System.out.println(Employee.nameReturn(employee));
        System.out.println(Employee.averageAge(15,employee));
        Employee.youngestEmployee(employee);
        System.out.println(Employee.nameReturn(employee));
        System.out.println(employee);


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

}
