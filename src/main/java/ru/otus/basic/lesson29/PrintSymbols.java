package ru.otus.basic.lesson29;


import java.util.Objects;

public class PrintSymbols {
    private final Object mon = new Object();
    private Print print = new Print();

    public static void main(String[] args) {
        PrintSymbols printSymbols = new PrintSymbols();
        new Thread(printSymbols::toA).start();
        new Thread(printSymbols::toB).start();
        new Thread(printSymbols::toC).start();

    }

    public void toA(){
        synchronized (mon){
            for (int i = 0; i < 6; i++) {
                while (print.value != null){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                print.putA();
                mon.notifyAll();
            }
        }
    }

    public void toB(){
        synchronized (mon){
            for (int i = 0; i < 6; i++) {
                while (!Objects.equals(print.value, "A")){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                print.putB();
                mon.notifyAll();
            }
        }
    }

    public void toC(){
        synchronized (mon){
            for (int i = 0; i < 6; i++) {
                while (!Objects.equals(print.value, "B")){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                print.putC();
                mon.notifyAll();
            }
        }
    }

    private static class Print {
        private String value;

        public void putA() {
            value = "A";
            System.out.print("A");
        }

        public void putB() {
            value = "B";
            System.out.print("B");
        }

        public void putC() {
            value = null;
            System.out.print("C");
        }
    }
}






