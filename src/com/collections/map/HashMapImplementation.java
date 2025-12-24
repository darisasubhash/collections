package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapImplementation {

    HashMap<Integer,String> map=new HashMap<Integer,String>();

    public void runMethods()
    {
        map.put(1,"subhash");
        map.put(2,"null");
        map.put(3,"green");

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(5,"anil");
        map1.put(6,"sharath");
        map1.put(7,"chandra");
        map.putAll(map1);
        map.remove(2);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("subhash"));
        System.out.println(map.getOrDefault(5,"not available"));
        map.putIfAbsent(10,"aadi");
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }
        Collection<String> values=map.values();
        for(String value:values){
            System.out.println(value);
        }
        Set<Entry<Integer,String>> entries=map.entrySet();
        for(Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }
}
