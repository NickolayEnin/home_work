package ru.enin.basic.lesson5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        firstMassive(5, 4, 2, 10, 20, 3);
        secondMassive();
        thirdMassive();
        fourthMassive();
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

    public static void secondMassive() {
        int a = 7;
        int[] b = new int[20];
        for (int i = 0; i < b.length; i++) {
            b[i] = a;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void thirdMassive() {
        int a = 7;
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] += a;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void fourthMassive() {
        int[] inp = {3, 5, 3, 4, 5, 1, 4, 2};
        int n = inp.length;
        int right = 0;
        int left = 0;
        int[] a = new int[n / 2];
        int[] b = new int[n - a.length];

        for (int i = 0; i < n; i++) {
            if (i < a.length) {
                a[i] = inp[i];
            } else {
                b[i - a.length] = inp[i];
            }
        }
        for (int i = 0; i < a.length; i++){
            left += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            right += b[i];
        }
        if (right < left){
            System.out.println("левая сторона больше");
        } else {
            System.out.println("правая сторона больше");
        }

        System.out.println(Arrays.toString(a) + " левая сторона" + " " + left);
        System.out.println(Arrays.toString(b) + " правая сторона" + " " + right);

    }
}

