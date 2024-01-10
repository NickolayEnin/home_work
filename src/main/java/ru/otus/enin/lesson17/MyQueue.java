package ru.otus.enin.lesson17;

public class MyQueue<E> extends MyLinkedList{
    public boolean offer(E e) {
        linkLast(e);
        return true;
    }
    public E poll() {
        return (E) removeFirst();
    }

}
