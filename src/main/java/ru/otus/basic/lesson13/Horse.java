package ru.otus.basic.lesson13;

public class Horse implements Transport {
    public final int CROSS_COUNTRY_ABILITY = 2;
    protected String name;
    protected int stamina;
    protected int usedStamina;
    protected int speed;

    public Horse(String name, int stamina, int usedStamina, int speed) {
        this.name = name;
        this.stamina = stamina;
        this.usedStamina = usedStamina;
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(Locality locality, String currentTransport, int stamina, int usedStamina) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(name)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }
        if (CROSS_COUNTRY_ABILITY < locality.getComplexity()) {
            System.out.println(name + " сложная трасса не смог проскакать по " + locality.name());
            return false;
        }
        this.stamina = this.stamina - (locality.getDistanse() * this.usedStamina);
        if (this.stamina >= 0) {
            int time = locality.getDistanse() / speed;
            System.out.println(name + " проскакал дистанцию " + locality.name());
            System.out.println("осталось выносливости " + this.stamina);
            return true;
        }
        System.out.println(name + " не хватило выносливости на дистанцию " + locality.name());
        return false;
    }
}
