package com.collections.list;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search(10));
        System.out.println(stack.contains(20));
        System.out.println(stack.size());
        for (int value : stack) {
            System.out.println(value);
        }
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
