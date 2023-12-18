package org.example;

//To convert the map into set and print key and value separate
import java.util.*;

import java.util.Iterator;
public class Map1 {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put(1,"Mon");
        m1.put(2,"Tue");
        m1.put(3,"Wed");
        m1.put(4,"Thru");
        System.out.print(m1);

        Set set=m1.entrySet();
        Iterator i1=set.iterator();
        while(i1.hasNext()){
            Map.Entry entry=(Map.Entry)i1.next();

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
