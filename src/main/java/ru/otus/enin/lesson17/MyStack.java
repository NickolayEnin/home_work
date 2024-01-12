package ru.otus.enin.lesson17;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack<E> extends MyLinkedList{
    public boolean push(E e) {
        linkLast(e);
        return true;
    }
    public E pop() {
        return (E) removeLast();
    }

}

