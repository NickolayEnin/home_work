package ru.otus.basic.lesson21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        result(massive());
        System.out.println(System.currentTimeMillis() - time);

        double[] array = massive();
        long time1 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            resultThread(array, 0, 25_000_000);
        });
        Thread t2 = new Thread(() -> {
            resultThread(array, 25_000_001, 50_000_000);
        });
        Thread t3 = new Thread(() -> {
            resultThread(array, 50_000_001, 75_000_000);
        });
        Thread t4 = new Thread(() -> {
            resultThread(array, 75_000_001, 99_999_999);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(System.currentTimeMillis() - time1);
    }

    public static double[] massive() {
        double[] massive = new double[100_000_000];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i;
        }
        return massive;
    }

    public static double[] result(double[] massive) {
        for (int i = 0; i < massive.length; i++) {
            massive[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return massive;
    }

    public static double[] resultThread(double[] massive, int min, int max) {
        for (int i = min; i < max; i++) {
            massive[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return massive;
    }
}