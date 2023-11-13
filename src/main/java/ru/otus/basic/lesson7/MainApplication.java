package ru.otus.basic.lesson7;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[][] a = {{2, 1, -3, 4}, {2, 2, 2, 2}, {1, 3, 10, 4}, {1, 3, 4, 4}};
        int[][] b = {{2, 4, -3, 4}, {2, 1, 2, 2}};
        int[][] array = new int[0][0];
        System.out.println("сумма положительных эл-ов " + sumOfPositiveElements(a));
        print(array(10));
        System.out.println("поиск максимума " + findMax(a));
        print(array0(a));
        System.out.println("сумма второй строки " + sumSecondLine(b));
        System.out.println(sumSecondLine(array));



    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;

    }

    public static void print(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] array(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                if (i == j) {
                    array[i][j] = 'x';
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 'x';
                }
            }
        }
        return array;
    }

    public static int[][] array0(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 0;
                }

            }
        }
        return array;
    }

    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondLine(int[][] array) {
        int sum = 0;
        if (array.length < 2){
            sum =-1;
            return sum;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                for (int j = 0; j < array.length; j++) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}






