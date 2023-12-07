package ru.otus.basic.lesson13;

public class MainApplication {
    public static void main(String[] args) {
        Human human = new Human("Yasha",  10);
        Transport car = new Car("BMW", 200);
        Transport bicycle = new Bicycle("Kama", 20);
        Transport carAllRoad = new CarAllRoad("MAN", 100);
        Transport horse = new Horse("Spirit", 150, 1, 30);
        human.chooseTransport(horse);
        human.ride(horse, Locality.PLAIN);
//        human.info();
        human.info();
    }
}
