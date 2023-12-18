package org.example;
import java.util.*;

import static java.util.Arrays.stream;
import static jdk.nashorn.internal.objects.NativeArray.forEach;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Map3 {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"Mon");
        m1.put(2,"Tue");
        m1.put(3,"Wed");
        System.out.println(m1);

       // m1.stream();
//        System.out.println(m1);
//        for(Map.Entry m:m1.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
        //.sorted(Map.Entry.comparingByKey());
        //.forEach(System.out::println());

        //Search
        if(m1.containsKey(5)){
            System.out.println("present in map");
        }
        else{
            System.out.println("Not Present");
        }

        System.out.println(m1.get(2));
        System.out.println(m1.get(5));

       // int arr[]={12,15,16};
//
        for(Map.Entry n1:m1.entrySet()){
        System.out.println(n1.getKey()+" "+n1.getValue());
        }
//Iterate through set
        Set<Integer> s1=m1.keySet();
        for(Integer map:s1){
            System.out.println(map+" "+m1.get(map));
        }
    }
}
