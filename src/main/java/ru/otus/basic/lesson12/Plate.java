package ru.otus.basic.lesson12;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public int addFood(int add) {
        if (maxFood < currentFood + add) {
            System.out.println("переполнение миски ");
            return currentFood;
        }
        return currentFood += add;
    }

    public boolean reducingFood(int eat) {
        if (currentFood - eat >= 0) {
            currentFood -= eat;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("еды в миске: " + currentFood);
    }

}
