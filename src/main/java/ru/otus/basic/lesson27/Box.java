package ru.otus.basic.lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public int weight() {
        int weight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        return weight;
    }

    public List<String> contentBox() {
        List<String> name = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            name.add(fruits.get(i).getName());
        }
        return name;
    }

    public boolean compare(Box o) {
        if (this.weight() == o.weight()) {
            return true;
        }
        return false;
    }

    public void combine(Box<? extends T> o) {
        for (int i = 0; i < o.fruits.size(); i++) {
            this.add((T) o.fruits.get(i));
        }
    }
}
