package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //ArrayList<Integer> list=new ArrayList<>();   Both Work

        //add Element
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //get Element
        int element =list.get(0);
        System.out.println(element);

        //add el in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,10);
        System.out.println(list);

        //remove element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println(list);

        //Want to Print Without list
        Iterator l1=list.iterator();
        while(l1.hasNext()){
            System.out.println(l1.next());
        }

        list.removeIf(str->(str%5==0));
        System.out.println(list);

    }
}
