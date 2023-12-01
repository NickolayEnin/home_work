package ru.otus.basic.lesson13;

public class Locality {
    String name;
    int complexity;
    int distanse;


    public Locality(String name, int complexity, int distanse) {
        this.name = name;
        this.complexity = complexity;
        this.distanse = distanse;
    }

    public String getName() {
        return name;
    }

//    public boolean ride(Transport transport) {
//        return transport.move(distanse, complexity, name);
//    }
}