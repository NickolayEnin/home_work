package ru.otus.basic.lesson13;

public class Bicycle implements Transport {
    public final int CROSSCOUNTRYABILITY = 2;
    String model;
    int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return model;
    }

    @Override
    public boolean move(int distance, int locality, String localityName, String currentTransport, int stamina, int usedStamina) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(model)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }
        if (CROSSCOUNTRYABILITY < locality) {
            System.out.println(model + " сложная трасса не проехала дистанцию ");
            return false;
        }
        stamina = stamina - (distance * (usedStamina / 2));
        if (stamina >= 0) {
            int time = distance / speed;
            System.out.println(model + " проехала дистанцию");
            return true;
        }
        System.out.println(model + " не хватило выносливости на дистанцию");
        return false;
    }
}
