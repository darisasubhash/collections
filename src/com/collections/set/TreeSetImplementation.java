package com.collection.set;

import java.util.TreeSet;

public class TreeSetImplementation {

    TreeSet set=new TreeSet();
    {
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(20);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(20));
        System.out.println(set.contains(50));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.lower(25));
        System.out.println(set.floor(30));
        System.out.println(set.ceiling(25));
        System.out.println(set.higher(30));
        System.out.println(set.headSet(30));
        System.out.println(set.tailSet(30));
        System.out.println(set.subSet(15, 35));
        System.out.println(set.headSet(30, true));
        System.out.println(set.tailSet(30, false));
        System.out.println(set.subSet(10, true, 30, true));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        TreeSet<Integer> copy = (TreeSet<Integer>) set.clone();
        set.remove(20);
        set.clear();
    }
}
