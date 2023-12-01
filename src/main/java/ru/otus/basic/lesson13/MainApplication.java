package ru.otus.basic.lesson13;

public class MainApplication {
    public static void main(String[] args) {
        Human human = new Human("Yasha",  10);
        Locality l1 = new Locality("Plain", 1, 100111);
        Locality l2 = new Locality("Forest", 2, 1001);
        Locality l3 = new Locality("Swamp", 3, 100);
        Transport car = new Car("BMW", 200);
        Transport bicycle = new Bicycle("Kama", 20);
        Transport carAllRoad = new CarAllRoad("MAN", 100);
        Transport horse = new Horse("Spirit", 150, 5, 30);
        human.chooseTransport(bicycle);
        human.ride(bicycle, l3);
        human.ride(car, l1);
        human.leaveTransport();
        human.info();
        human.ride(carAllRoad, l1);
    }
}
