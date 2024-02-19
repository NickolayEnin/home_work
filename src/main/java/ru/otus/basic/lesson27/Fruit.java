package ru.otus.basic.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private int weight;
    private String name;

    public Fruit(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public List<Integer> weightReturn(List<Fruit> fruits) {
        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            w.add(fruits.get(i).getWeight());
        }
        return w;
    }

}
