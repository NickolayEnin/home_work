package ru.otus.basic.lesson11oop2.animals;

public class Animal {
    String name;
    String kindOfAnimal;
    int speedRun;
    int speedSwim;
    int stamina;
    int usedRunStamina;
    int usedSwimStamina;


    public int run(int distance) {
        int enduranceTest = stamina - (usedRunStamina * distance);
        if (enduranceTest >= 0) {
            stamina = stamina - (usedRunStamina * distance);
            int time = distance / speedRun;
            System.out.println(kindOfAnimal + " " + name + " " + "пробежал дистанцию в: " + distance + " метров за " + time + " секунд");
            return stamina;
        }
        System.out.println("не хватает выносливости: " + (stamina - (usedRunStamina * distance)));
        return stamina;
    }

    public int swim(int distance) {
        int enduranceTest = stamina - (usedSwimStamina * distance);
        if (enduranceTest >= 0) {
            stamina = stamina - (usedSwimStamina * distance);
            int time = distance / speedSwim;
            System.out.println(kindOfAnimal + " " + name + " " + "проплыл дистанцию в: " + distance + " метров за " + time + " секунд");
            return stamina;
        }
        System.out.println(-1 + "не хватает выносливости: " + (stamina - (usedSwimStamina * distance)));
        return stamina;
    }

    public void info() {
        System.out.println("вид: " + kindOfAnimal);
        System.out.println("имя: " + name);
        System.out.println("скорость бега: " + speedRun);
        System.out.println("скорость плавания: " + speedSwim);
        System.out.println("выносливость: " + stamina);
        System.out.println("расход выносливости бег: " + usedRunStamina);
        System.out.println("расход выносливости плавание: " + usedSwimStamina);
    }


}
