package ru.otus.basic.lesson28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        var file = new File("target/");
        System.out.println("список имеющихся файлов: " + Arrays.stream(Objects.requireNonNull(file.listFiles())).map(File::getName).toList());
        System.out.println("какой файл загрузить?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("target/" + name))) {
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(" ");
                lines.addAll(Arrays.asList(l));
            }
            counter = count(lines);
            System.out.println(lines);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    public static int count(List<String> input) {
        Scanner scanner1 = new Scanner(System.in);
        String scr = scanner1.nextLine();
        int counter = 0;
        for (int i = 0; i < input.size(); i++) {
            if (scr.equals(input.get(i))) {
                counter++;
            }
        }
        return counter;
    }
}



