package ru.otus.enin.lesson17;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    private final LinkedList<Integer> list = new LinkedList<>();
    public void addFirst(int number) {
        list.addFirst(number);
    }
    public void addLast(int number) {
        list.addLast(number);
    }

    public void print() {
        System.out.println(list);
    }
    public void getFirst() {
        int first = list.getFirst();
        System.out.println(first);
    }
    public void getLast() {
        int last = list.getLast();
        System.out.println(last);
    }
    public void add(int position, int num) {
        list.add(position,num);
        System.out.println(list);
    }
    public void remove(int position) {
        list.remove(position);
        System.out.println(list);
    }
    public int get(int position) {
        System.out.println(list);
        return list.get(position);
    }
    public int getSize() {
        System.out.println(list.size());
        return list.size();
    }
}
