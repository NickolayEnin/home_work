package ru.otus.basic.lesson13;

public class CarAllRoad implements Transport {
    public final int CROSSCOUNTRYABILITY = 3;
    String brand;
    int petrol;
    int usedPetrol;
    int speed;

    public CarAllRoad(String brand, int speed) {
        this.brand = brand;
        this.petrol = 5000;
        this.usedPetrol = 25;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return brand;
    }

    @Override
    public boolean move(int distance, int locality, String localityName, String currentTransport, int stamina, int usedStamina) {
        if (currentTransport == null) {
            System.out.println("идет пешком");
            return true;
        }
        if (!currentTransport.equals(brand)) {
            System.out.println("не тот транспорт, что выбрал человек");
            return false;
        }

        if (CROSSCOUNTRYABILITY < locality) {
            System.out.println(brand + " сложная трасса не проехала дистанцию");
            return false;
        }
        petrol = petrol - (distance * usedPetrol);
        if (petrol >= 0) {
            int time = distance / speed;
            System.out.println(brand + " проехала дистанцию " + localityName + currentTransport);
            return true;
        }
        System.out.println(brand + " не хватило топлива на дистанцию " + localityName);
        return false;
    }
}
