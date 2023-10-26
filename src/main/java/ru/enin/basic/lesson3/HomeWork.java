package ru.enin.basic.lesson3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        greetings();

    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число,чтобы выбрать цвет");
        int data = scanner.nextInt();
        if (data <= 10) {
            System.out.println("красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("желтый");
        } else {
            System.out.println("зеленый");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a" + " " + ">=" + " " + "b");
        } else {
            System.out.println("a" + " " + "<" + " " + "b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
            System.out.println(initValue);
        }

    }
}
