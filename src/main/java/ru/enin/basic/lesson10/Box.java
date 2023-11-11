package ru.enin.basic.lesson10;

public class Box {
    private String color;
    private String item;
    private int size;
    private boolean isOpened;
    private int sizeItem;

    public void setColor(String color) {
        this.color = color;
    }

    public Box(String color, int size, boolean isOpened) {
        this.color = color;
        this.size = size;
        this.isOpened = isOpened;
    }

    public Box(String item, int sizeItem) {
        this.item = item;
        this.sizeItem = sizeItem;
    }


    public void put(String item, int sizeItem) {
        if (!isOpened) {
            System.out.println("коробка закрыта");
            return;
        }
        if (this.item != null) {
            System.out.println("в коробке лежит предмет");
            return;
        }
        if (sizeItem > this.size) {
            System.out.println("предмет слишком большой");
            return;
        }
        this.item = item;
        System.out.println("в коробку положили: " + item);
    }

    public void unPut() {
        if (!isOpened) {
            System.out.println("коробка закрыта");
            return;
        }
        if (this.item == null) {
            System.out.println("в коробке не лежит предмет");
            return;
        }
        this.item = null;
        System.out.println("из коробки выбросили предмет");

    }
    public void info(){
        System.out.println("цвет коробки: " + color + " " + "размер коробки: " + size);
        if (isOpened){
            System.out.println("коробка открыта");
        } else {
            System.out.println("коробка закрыта");
        }
    }
}
