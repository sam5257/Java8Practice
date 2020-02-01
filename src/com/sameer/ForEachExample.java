package com.sameer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

    public static void main(String[] args) {


        //Normal way to loop a Map

        Map<String,Integer> item=new HashMap<>();
        item.put("A",10);
        item.put("B",20);
        item.put("C",30);
        item.put("D",40);
        item.put("E",50);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for(Map.Entry<String,Integer> entry : item.entrySet())
        {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        System.out.println("Looping map using foreach loop");

        //using foreach loop + lambda exp

        item.forEach((k,v)-> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("printing list using normal loop");

        for (String s:list)
        {
            System.out.println(s);
        }

        System.out.println("printing list using foreach loop");

        list.forEach(i-> System.out.println(i));

        //Output : C
        list.forEach(e->{
            if("C".equals(e)){
                System.out.println(e);
            }
        });

        //method reference
        //Output : A,B,C,D,E
        list.forEach(System.out::println);

        //Stream and filter
        //Output : B
        list.stream().filter(s->s.contains("B")).forEach(System.out::println);
    }
}
