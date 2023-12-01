package ru.otus.basic.lesson13;

public class Horse implements Transport {
    public final int CROSSCOUNTRYABILITY = 2;
    String name;
    int stamina;
    int usedStamina;
    int speed;

    public Horse(String name, int stamina, int usedStamina, int speed) {
        this.name = name;
        this.stamina = stamina;
        this.usedStamina = usedStamina;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(int distance, int locality, String localityName, String currentTransport, int stamina, int usedStamina) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(name)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }
        if (CROSSCOUNTRYABILITY < locality) {
            System.out.println(name + " сложная трасса не проехала дистанцию");
            return false;
        }
        this.stamina = this.stamina - (distance * this.usedStamina);
        if (this.stamina >= 0) {
            int time = distance / speed;
            System.out.println(name + " проехала дистанцию");
            return true;
        }
        System.out.println(name + " не хватило выносливости на дистанцию");
        return false;
    }
}
