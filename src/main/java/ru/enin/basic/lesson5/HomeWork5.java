package ru.enin.basic.lesson5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        firstMassive(6, 4, 2, 10, 20, 3);
        secondMassive(1, 3, 4, 56, 7, 1, 2, 2);
        thirdMassive(2,4,6,7,1,2,3,4,5);
        fourthMassive(12,2,42,5,7,9,1,24,5,2);
    }

    public static void firstMassive(int... sum) {
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > 5) {
                result += sum[i];
            }
        }
        System.out.println(result);
    }

    public static void secondMassive(int... b) {
        int a = 7;
        for (int i = 0; i < b.length; i++) {
            b[i] = a;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void thirdMassive(int... b) {
        int a = 7;
        for (int i = 0; i < b.length; i++) {
            b[i] += a;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void fourthMassive(int... inp) {
        int right = 0;
        int left = 0;

        if (inp.length % 2 == 0) {
            for (int i = 0; i < inp.length; i++) {
                if (i < inp.length / 2) {
                    left += inp[i];
                } else {
                    right += inp[i];
                }
            }
        } else {
            System.out.println("массив не четный");
            return;
        }

        if (right < left) {
            System.out.println("левая сторона больше");
        } else {
            System.out.println("правая сторона больше");
        }

        System.out.println(" левая сторона" + " " + left);
        System.out.println(" правая сторона" + " " + right);

    }
}

