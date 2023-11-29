package ru.otus.basic.lesson11oop2.animals;

public class Dog extends Animal {
    public Dog(String name, String kindOfAnimal, int speedRun, int stamina, int usedRunStamina, int speedSwim, int usedSwimStamina) {
        this.name = name;
        this.kindOfAnimal = kindOfAnimal;
        this.speedRun = speedRun;
        this.stamina = stamina;
        this.usedRunStamina = usedRunStamina;
        this.usedSwimStamina = usedSwimStamina;
        this.speedSwim = speedSwim;
    }

}


