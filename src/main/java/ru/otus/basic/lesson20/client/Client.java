package ru.otus.basic.lesson20.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws IOException {

        try (
                Socket socket = new Socket("localhost", 8090)) {
            try (
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {
                printResponse(reader);
                writeClient(writer);
                printResponse(reader);
                writeClient(writer);
                printResponse(reader);
                writeClient(writer);
                printResponse(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void printResponse(BufferedReader reader) throws IOException {
        String response = reader.readLine();
        System.out.println(response);
    }

    public static void writeClient(BufferedWriter writer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        writer.write(number1);
        writer.newLine();
        writer.flush();
    }
}
