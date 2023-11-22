package ru.otus.basic.lesson11oop2;

import ru.otus.basic.lesson11oop2.animals.Cat;
import ru.otus.basic.lesson11oop2.animals.Dog;
import ru.otus.basic.lesson11oop2.animals.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Dog dog = new Dog("Ричи","собака",5,100,1 ,4,2);
        Cat cat = new Cat("Тимофей","кот",3,120, 1);
        Horse horse = new Horse("Спирит","лошадь",20,200,1,10,4);
//        dog.run(20);
//        dog.swim(20);
        horse.run(40);
        horse.swim(40);
//        cat.swim(20);
//        cat.run(30);
//        dog.info();
//        cat.info();
        horse.info();
    }
}
