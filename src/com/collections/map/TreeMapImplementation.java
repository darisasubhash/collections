package com.collections.map;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImplementation {

    TreeMap<Integer,String> map=new TreeMap<>();
    public void rumMethods(){
        map.put(5, "subhash");
        map.put(1, "aravind");
        map.put(3, "suhas");
        map.put(2, "anirudh");
        map.put(4, "kiran");
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("aravind"));
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.lowerKey(3));
        System.out.println(map.higherKey(3));
        System.out.println(map.headMap(3));
        System.out.println(map.tailMap(3));
        System.out.println(map.subMap(2, 4));
        System.out.println(map.descendingMap());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        map.remove(3);
        System.out.println(map.size());
    }
}
