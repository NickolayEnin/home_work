package ru.otus.enin.lesson17;

import java.util.Arrays;
import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(75);

        list.addFirst(42);
        list.addFirst(1949);
        list.addFirst(6950);

        MyQueue queue = new MyQueue();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        print(queue);
        queue.poll();
        print(queue);
        System.out.println("===================");
        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        print(stack);
        stack.pop();
        print(stack);
        System.out.println("===================");
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);

        }
        for (int i = 0; i < array.length; i++) {
            boolean b = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buffer;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static void print(MyLinkedList list) {
        for (int i = 0; i< list.size; i++){
            System.out.println(list.get(i));
        }
    }
}
