package ru.otus.basic.lesson13;

public interface Transport {
    String getName();
    boolean move(Locality locality, String transport, int stamina, int usedStamina);
}
