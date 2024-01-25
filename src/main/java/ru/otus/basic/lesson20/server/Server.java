package ru.otus.basic.lesson20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(8090)) {
            while (true) {
                try (
                        Socket socket = server.accept();
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ) {
                    writer.write("введите первое число");
                    writer.newLine();
                    writer.flush();
                    int number1 = printResponse(reader);
                    writer.write("введите операцию");
                    writer.newLine();
                    writer.flush();
                    String operation = printOperation(reader);
                    writer.write("введите второе число");
                    writer.newLine();
                    writer.flush();
                    int number2 = printResponse(reader);
                    writer.write("результат: " + result(number1, number2, operation));
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int result(int number1, int number2, String operation) {
        int result = 0;
        if (operation.equals("*")) {
            result = number1 * number2;
        }
        if (operation.equals("+")) {
            result = number1 + number2;
        }
        if (operation.equals("-")) {
            result = number1 - number2;
        }
        if (operation.equals("/") && number1 != 0 && number2 != 0) {
            result = number1 / number2;
        }
        return result;
    }

    public static int transform(String response) {
        int number = Integer.parseInt(response);
        return number;
    }

    public static String printOperation(BufferedReader reader) throws IOException {
        String operation = reader.readLine();
        return operation;
    }

    public static int printResponse(BufferedReader reader) throws IOException {
        String response = reader.readLine();
        System.out.println(transform(response));
        return transform(response);
    }
}
