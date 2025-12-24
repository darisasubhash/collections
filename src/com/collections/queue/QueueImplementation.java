package com.collections.queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        for (int value : queue) {
            System.out.println(value);
        }
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
