package ru.otus.basic.lesson14;

public class MainApplication {
    public static void main(String[] args) throws AppArraySizeException {
        String ar[][] = {
                {"1", "2", "3", "4" },
                {"1", "fdas", "3", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" }
        };
        try {
            sumStringArray(ar);
        } catch (NumberFormatException e) {
//            for (int i = 0; i < ar.length; i++) {
//                for (int j = 0; j < ar[i].length; j++) {
//                }
//            }
            throw new AppArrayDataException(e.getMessage());
        }
    }

    public static void sumStringArray(String[][] array) throws AppArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new AppArraySizeException("неверный размер");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("неверный размер");
            }
            for (int j = 0; j < array[i].length; j++) {
                int x = Integer.parseInt(array[i][j]);
                sum += x;
            }
            System.out.println(sum);
        }
    }

    static class AppArraySizeException extends Exception {
        public AppArraySizeException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return "не верный размер массива";
        }
    }

    static class AppArrayDataException extends NumberFormatException {
        public AppArrayDataException(String s) {
            super(s);
        }

        @Override
        public String getMessage() {
            return "не верный формат в ячейке";
        }
    }
}