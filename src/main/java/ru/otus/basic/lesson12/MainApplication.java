package ru.otus.basic.lesson12;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(150);
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Barsik1", 35),
                new Cat("Barsik2", 90),
                new Cat("Barsik3", 40),
                new Cat("Barsik4", 60),
        };
        for (int i = 0; i < cats.length; i++) {
            plate.info();
            cats[i].info();
            cats[i].eatCat(plate);
        }
        System.out.println("=".repeat(30));
        for (int i = 0; i < cats.length; i++) {
            plate.info();
            cats[i].info();
            cats[i].eatCat(plate);

        }
    }
}
