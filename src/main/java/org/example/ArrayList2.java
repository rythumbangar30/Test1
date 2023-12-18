package org.example;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {


    List<String> list=new ArrayList<String>();
    list.add("Rahul");
    list.add("Shree");
    list.add("Namo");
    list.add("Minal");

    System.out.println(list);
    //Collections.sort(list);
//    for(String name:list){
//        System.out.println(name);
//    }
        System.out.println("Traversing list through list operator");
    ListIterator<String> list1= list.listIterator(list.size());
    while(list1.hasPrevious()){
        String str= list1.previous();
        System.out.println(str);
        }
    System.out.println("Traversing the list");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        }
        System.out.println("Traversing list through foreach operator");
    list.forEach(a->{
        System.out.println(a);
    });

    }
}