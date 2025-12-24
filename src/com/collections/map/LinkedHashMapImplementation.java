package com.collections.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapImplementation {

    LinkedHashMap<Integer,String> map=new LinkedHashMap<>();

    public void runMethods(){
        map.put(1, "subhash");
        map.put(2, "null");
        map.put(3, "game");
        map.put(4, "anil");
        map.putIfAbsent(4, "pradeep");
        System.out.println("Get key 2 : " + map.get(2));
        System.out.println(map.getOrDefault(10, "Not Found"));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("anil"));
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
        map.replace(3, "game");
        map.remove(4);
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
    }
}
