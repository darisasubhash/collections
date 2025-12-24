package com.collections.list;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(1, 15);
        list.addFirst(5);
        list.addLast(25);
        list.offer(30);
        list.offerFirst(1);
        list.offerLast(35);
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.set(2, 99);
        list.remove();
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        list.poll();
        list.pollFirst();
        list.pollLast();
        System.out.println(list.contains(25));
        System.out.println(list.indexOf(25));
        System.out.println(list.lastIndexOf(25));
        list.push(100);
        System.out.println(list.pop());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
    }
}
