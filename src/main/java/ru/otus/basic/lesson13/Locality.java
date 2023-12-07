package ru.otus.basic.lesson13;

public enum Locality {
    PLAIN(1,150),
    FOREST(2,100),
    SWAMP(3,100);


   private int complexity;
   private int distanse;

    public int getComplexity() {
        return complexity;
    }

    public int getDistanse() {
        return distanse;
    }

    Locality(int complexity, int distanse) {
        this.complexity = complexity;
        this.distanse = distanse;
    }

}