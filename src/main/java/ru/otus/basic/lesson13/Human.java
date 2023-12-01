package ru.otus.basic.lesson13;


public class Human {
    protected String name;
    protected String currentTransport;
    protected int stamina;
    protected int usedStamina;
    protected int speed;

    public Human(String name,int speed) {
        this.name = name;
        this.currentTransport = null;
        this.stamina = 100;
        this.usedStamina = 10;
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public String chooseTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println(name + " уже выбрал транспорт " + currentTransport);
            return currentTransport;
        }
        currentTransport = transport.getName();
        System.out.println(name + " выбрал транспорт " + currentTransport);
        return currentTransport;
    }

    public String leaveTransport() {
        if (currentTransport != null) {
            currentTransport = null;
            System.out.println(name + " покинул транспорт");
            return currentTransport;
        }
        System.out.println(name + " идет пешком");
        return currentTransport;
    }

    public boolean ride(Transport transport, Locality locality) {
        return transport.move(locality.distanse, locality.complexity, locality.name, currentTransport, stamina, usedStamina);

    }

    public void info() {
        System.out.println(currentTransport);
        System.out.println(name);
    }

}
