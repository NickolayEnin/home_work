package ru.otus.basic.lesson14;

public class MainApplication {
    public static void main(String[] args) throws AppArraySizeException {
        String ar[][] = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        System.out.println(sumStringArray(ar));

    }

    public static int sumStringArray(String[][] array) throws AppArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new AppArraySizeException("неверный размер");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("неверный размер");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int x = Integer.parseInt(array[i][j]);
                    sum += x;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("строка " + String.valueOf(i + 1) + " столбец " + String.valueOf(j + 1));
                } catch (Exception e) {
                    System.out.println("аяяй");
                }
            }
        }
        return sum;
    }

    static class AppArraySizeException extends Exception {
        public AppArraySizeException(String message) {
            super(message);
        }
    }

    static class AppArrayDataException extends NumberFormatException {
        public AppArrayDataException(String message) {
            super(message);
        }
    }
}
