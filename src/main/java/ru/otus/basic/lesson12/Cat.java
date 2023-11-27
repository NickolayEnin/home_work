package ru.otus.basic.lesson12;

public class Cat {
    protected String name;
    protected boolean satiety;
    protected int maxSatiety;

    public Cat(String name, int maxSatiety) {
        this.name = name;
        this.satiety = false;
        this.maxSatiety = maxSatiety;
    }

    public String getName() {
        return name;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void info() {
        System.out.println("имя: " + name);
        System.out.println("сытость: " + satiety);
        System.out.println("аппетит: " + maxSatiety);
    }

    public void eatCat(Plate plate) {
        if (maxSatiety > plate.currentFood) {
            System.out.println("Кот " + getName() + " не поел, недостаточно еды");
            plate.addFood(20);
            return;
        }
        plate.reducingFood(maxSatiety);
        satiety = true;
        System.out.println("кот " + getName() + " поел  еды в миске: " + plate.currentFood);
    }
}
