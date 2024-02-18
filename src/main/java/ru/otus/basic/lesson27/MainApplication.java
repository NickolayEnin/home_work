package ru.otus.basic.lesson27;

public class MainApplication {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1, "apple1");
        Apple apple2 = new Apple(1, "apple2");
        Apple apple3 = new Apple(1, "apple3");
        Apple apple11 = new Apple(1, "apple11");
        Apple apple22 = new Apple(1, "apple22");
        Apple apple33 = new Apple(1, "apple33");
        Orange orange = new Orange(2, "orange");
        Box<Apple> boxWithApple = new Box<>();
        Box<Apple> boxWithApple1 = new Box<>();
        Box<Orange> boxWithOrange = new Box<>();
        boxWithOrange.add(orange);
        Box<Fruit> boxWithFruits = new Box<>();
        boxWithApple.add(apple1);
        boxWithApple.add(apple2);
        boxWithApple.add(apple3);
        boxWithApple1.add(apple11);
        boxWithApple1.add(apple22);
        boxWithApple1.add(apple33);
        boxWithFruits.add(orange);
        boxWithFruits.add(apple1);
        System.out.println(boxWithFruits.weight());
        System.out.println(boxWithFruits.compare(boxWithApple));
        System.out.println(boxWithFruits.contentBox());
        System.out.println(boxWithApple.weight());
        boxWithApple.combine(boxWithApple1);
        System.out.println(boxWithApple.contentBox());
        System.out.println(boxWithApple.weight());
        boxWithFruits.combine(boxWithApple1);
        System.out.println(boxWithFruits.contentBox());
    }
}