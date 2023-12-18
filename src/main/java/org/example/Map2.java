package org.example;

//to traverse the map with genric
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"Mon");
        m1.put(2,"Tue");
        m1.put(3,"Wed");
        m1.put(4,"Thru");

        for(Map.Entry m:m1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
