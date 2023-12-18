package org.example;
import java.util.HashSet;
import java.util.Set;
public class Set1 {
    public static void main(String[] args) {


    Set<String> s1=new HashSet<>();
    s1.add("A");
    s1.add("B");
    s1.add("C");
    s1.add("cap");
    System.out.println("HashSet: "+s1);
    Set<String> s2=new HashSet<>();
    s2.add("A");
    s2.add("cap");
    s2.add("E");
    s2.addAll(s1);
    System.out.println(s2);
    System.out.println(s1.containsAll(s2));
}
}