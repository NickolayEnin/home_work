package ru.otus.basic.lesson13;

public interface Transport {
    String getName();
    boolean move(int distance, int locality, String localityName, String transport, int stamina, int usedStamina);
}
