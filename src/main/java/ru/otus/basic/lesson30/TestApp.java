package ru.otus.basic.lesson30;


import java.util.Arrays;

public class TestApp extends RuntimeException {

    public Integer[] partArrays(Integer[] ar) {

        if (!Arrays.asList(ar).contains(1)) {
            throw new RuntimeException("не содержит числа 1");
        }

        int lastIndex = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1) {
                lastIndex = i;
            }
        }
        int index = ar.length - lastIndex - 1;
        Integer[] arrNew = new Integer[index];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = ar[lastIndex + 1 + i];
        }
        System.out.println(Arrays.toString(arrNew));
        return arrNew;
    }

    public boolean containArrays(Integer[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (0 >= ar[i]) {
                return false;
            }
            if (ar[i] > 2) {
                return false;
            }
        }
        if (Arrays.asList(ar).contains(1) && Arrays.asList(ar).contains(2)) {
            return true;
        } else {
            return false;
        }
    }

}







