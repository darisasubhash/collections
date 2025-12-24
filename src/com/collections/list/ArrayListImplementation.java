package com.collections.list;

import java.util.ArrayList;

public class ArrayListImplementation {
   ArrayList list=new ArrayList();

   {
      list.add(20);
      list.add(100);
      list.add(200);
      list.add(150);
      list.add(80);
      list.add(90);
      list.add(1,20);

      ArrayList array1=new ArrayList<>();
      array1.add(10);
      array1.add(null);
      array1.add(2,200);
      array1.addFirst(20);
      array1.addLast(20);
      array1.hashCode();
      list.addAll(array1);
      list.addAll(1,array1);
      Object []array=list.toArray();
      list.stream().forEach(System.out::println);
      list.set(3,45);
      System.out.println(list.indexOf(25));
      System.out.println(list.lastIndexOf(35));
      list.removeFirst();
      list.remove(3);
      list.removeAll(array1);
      array1.trimToSize();
      System.out.println(array1.get(5));
      System.out.println(array1.size());




   }


}
