package ru.otus.basic.lesson7;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[][] a = {{2, 1, -3}, {1,3,4,2}, {2, 3, 4, 5, 6, 7}};
        int[] b = {2, 1, -3};
        System.out.println(sumOfPositiveElements(a));
        print(array(10));
        System.out.println(findMax(a));
        System.out.println(sumSecondStroke(a));
        sumSecondStroke(b);


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

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondStroke(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void sumSecondStroke(int[] array){
        System.out.println(-1);
    }
}






