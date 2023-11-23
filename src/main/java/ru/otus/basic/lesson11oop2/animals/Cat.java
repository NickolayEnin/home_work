package ru.otus.basic.lesson11oop2.animals;

public class Cat extends Animal {
    public Cat(String name, String kindOfAnimal, int speedRun, int stamina, int usedRunStamina) {
        this.name = name;
        this.kindOfAnimal = kindOfAnimal;
        this.speedRun = speedRun;
        this.stamina = stamina;
        this.usedRunStamina = usedRunStamina;
    }

    @Override
    public int swim(int distance) {
        System.out.println("Коты не умеют плавать");
        return -1;
    }
    @Override
    public void info(){
        System.out.println("имя: " + name);
        System.out.println("скорость бега: " + speedRun);
        System.out.println("выносливость: " + stamina);
        System.out.println(-1 + " плавать не умеет");
        System.out.println("расход выносливости бег: " + usedRunStamina);
    }

}


