package ru.otus.basic.lesson13;

public class Car implements Transport {
    public final int CROSS_COUNTRY_ABILITY = 1;
    String brand;
    int petrol;
    int usedPetrol;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.petrol = 1500;
        this.usedPetrol = 10;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return brand;
    }

    @Override
    public boolean move(Locality locality,String currentTransport, int petrol, int usedPetrol) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(brand)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }
        if (CROSS_COUNTRY_ABILITY < locality.getComplexity()) {
            System.out.println(brand + " сложная трасса не проехала дистанцию " + locality.name());
            return false;
        }
        petrol = petrol - (locality.getDistanse() * usedPetrol);
        if (petrol >= 0) {
            int time = locality.getDistanse() / speed;
            System.out.println(brand + " проехала дистанцию " + locality.name());
            return true;
        }
        System.out.println(brand + " не хватило топлива на дистанцию " + locality.name());
        return false;
    }

}
