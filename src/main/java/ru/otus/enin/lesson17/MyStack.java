package ru.otus.enin.lesson17;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack extends MyLinkedList {
    private final Deque<Integer> deque = new LinkedList();

    public void push(int num) {
        deque.push(num);
        System.out.println(deque);
    }

    public void pop() {
        deque.pop();
        System.out.println(deque);
    }
}

