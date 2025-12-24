package com.collection.set;
import java.util.HashSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(20));
        set.remove(30);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(20);
        set.addAll(set2);
        set.removeAll(set2);
        set2.add(30);
        set2.add(45);
        set2.add(60);
        set.retainAll(set2);
        set.clear();
    }
}
