package ru.otus.basic.lesson13;

public class Bicycle implements Transport {
    public final int CROSS_COUNTRY_ABILITY = 2;
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
    public boolean move(Locality locality, String currentTransport, int stamina, int usedStamina) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(model)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }
        if (CROSS_COUNTRY_ABILITY < locality.getComplexity()) {
            System.out.println(model + " сложная трасса не проехала дистанцию " + locality.name());
            return false;
        }
        stamina = stamina - (locality.getDistanse() * (usedStamina / 2));
        if (stamina >= 0) {
            int time = locality.getDistanse() / speed;
            System.out.println(model + " проехала дистанцию " + locality.name());
            return true;
        }
        System.out.println(model + " не хватило выносливости на дистанцию " + locality.name());
        return false;
    }

}
