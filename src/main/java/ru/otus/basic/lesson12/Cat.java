package ru.otus.basic.lesson12;

public class Cat {
    private String name;
    private boolean satiety;
    private int maxSatiety;

    public Cat(String name, int maxSatiety) {
        this.name = name;
        this.satiety = false;
        this.maxSatiety = maxSatiety;
    }

    public void info() {
        System.out.println("имя: " + name);
        System.out.println("сытость: " + satiety);
        System.out.println("аппетит: " + maxSatiety);
    }

    public void eatCat(Plate plate) {
        if (satiety) {
            System.out.println("кот " + name + " не голоден");
            return;
        }
        if (maxSatiety > plate.getCurrentFood()) {
            System.out.println("Кот " + name + " не поел, недостаточно еды");
            plate.addFood(20);
            return;
        }
        plate.reducingFood(maxSatiety);
        satiety = true;
        maxSatiety = 0;
        System.out.println("кот " + name + " поел  еды в миске: " + plate.getCurrentFood());
    }
}
