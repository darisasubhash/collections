package com.collections.set;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set.contains(20));
        set.remove(30);
        System.out.println(set.size());
        for (Integer value : set) {
            System.out.println(value);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        set.clear();
        System.out.println(set.isEmpty());
    }
}
