package ru.otus.enin.lesson17;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue extends MyLinkedList{
    private final Queue<Integer> queue = new LinkedList();
    public void offer (int num){
        queue.offer(num);
        System.out.println(queue);
    }
    public void poll (){
        queue.poll();
        System.out.println(queue);
    }
}
