package ru.otus.basic.lesson11oop2.animals;

public class Animal {
   String name;
   String kindOfAnimal;
   int speedRun;
   int speedSwim;
   int stamina;
   int usedStamina;


    public String getName() {
        return name;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public int getStamina() {
        return stamina;
    }

    public int getUsedStamina() {
        return usedStamina;
    }

    public int run(int distance) {
        int enduranceTest = stamina - (usedStamina * distance);
        if (enduranceTest >= 0) {
            stamina = stamina - (usedStamina * distance);
            int time = distance/speedRun;
            System.out.println(kindOfAnimal + " " + name + " " + "пробежал дистанцию в: " + distance + " метров за " + time + " секунд");
            return stamina;
        }
        System.out.println("не хватает выносливости: " + (stamina - (usedStamina * distance)));
        return stamina;
    }
    public int swim(int distance) {
        int enduranceTest = stamina - (usedStamina * distance);
        if (enduranceTest >= 0) {
            stamina = stamina - (usedStamina * distance);
            int time = distance/speedSwim;
            System.out.println(kindOfAnimal + " " + name + " " + "проплыл дистанцию в: " + distance + " метров за " + time + " секунд");
            return stamina;
        }
        System.out.println(-1 + "не хватает выносливости: " + (stamina - (usedStamina * distance)));
        return stamina;
    }
    public void info(){
        System.out.println("вид: " + kindOfAnimal);
        System.out.println("имя: " + name);
        System.out.println("скорость бега: " + speedRun);
        System.out.println("скорость плавания: " + speedSwim);
        System.out.println("выносливость: " + stamina);
        System.out.println("расход выносливости: " + usedStamina);
    }


}
