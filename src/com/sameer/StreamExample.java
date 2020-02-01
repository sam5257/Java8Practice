package com.sameer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(30);
        arrayList.add(21);
        arrayList.add(13);
        arrayList.add(17);

        System.out.println(arrayList);


        //Print even numbers
      //  List<Integer> list=arrayList.stream().filter(i->i%2==0).filter(i->i%10==0).collect(Collectors.toList());

    //    System.out.println(list);
        //Below increment below arraylist element by 1
     //   List<Integer> list=arrayList.stream().map(i->i+1).collect(Collectors.toList());
        //if above stream is not their we have to loop every element an add the update value.lots of code.

        //System.out.println(list);
        //print divide by 5 count

  //      Long count=arrayList.stream().filter(i->i%5==0).count();

        //System.out.println(count);

        //sort all the elements of arraylist...sorted() method uses natural sorting order using Comparable

  //     List<Integer> list= arrayList.stream().sorted().collect(Collectors.toList());

    //    System.out.println(list);


        ArrayList<String> arrayList1=new ArrayList();
        arrayList1.add("a");
        arrayList1.add("dd");
        arrayList1.add("ccc");
        arrayList1.add("eeee");
        arrayList1.add("bbbb");

        System.out.println(arrayList1);


        //sorting according to increasing length
        Comparator<String> comparator=(s1,s2)->{

            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2) return -1;
            else if(l1>l2) return +1;
            else return s1.compareTo(s2);  //according to alpahabetic order
        };

        //below is reverse order of natural sorting .
       // List<String> customSorting=arrayList1.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());

        //Below we are using comparator for sorting
         List<String> customSorting=arrayList1.stream().sorted(comparator).collect(Collectors.toList());


        System.out.println(customSorting);


    }
}
