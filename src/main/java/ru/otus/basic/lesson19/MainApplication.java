package ru.otus.basic.lesson19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) throws java.io.FileNotFoundException {
        var file = new File("src");
        System.out.println("список имеющихся файлов: " + Arrays.stream(file.listFiles()).map(it -> it.getName()).toList());
        System.out.println("какой файл загрузить?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        FileInputStream in1 = new FileInputStream("src/" + name);
        BufferedInputStream inB = new BufferedInputStream(in1);
        try (InputStreamReader in = new InputStreamReader(inB)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        Scanner scanner1 = new Scanner(System.in);

        String data = scanner1.nextLine();
        try (var out = new BufferedOutputStream(new FileOutputStream("src/" + name, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

