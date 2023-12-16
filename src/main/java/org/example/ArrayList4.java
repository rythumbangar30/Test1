package org.example;
import java.util.ArrayList;
public class ArrayList4 {
    public static void main(String[] args) {

    ArrayList<String> l1=new ArrayList<>();
    l1.add("Shiv");
    l1.add("Tripti");
    l1.add("Namo");
    l1.add("Riya");
    System.out.println(l1);

    ArrayList<String> l2=new ArrayList<>();
    l2.add("Shree");
    l2.add("Krishna");

    l1.addAll(l2);
    System.out.println("After Adding the l2:"+l1);

    l1.removeAll(l2);
    System.out.println("After removing the l2:"+l1);

    l1.addAll(2,l2);
    System.out.println("After adding the l2 at the index:"+l1);

    l1.removeIf(str->str.contains("Tripti"));
    System.out.println("After Removing something specific from list:"+l1);

    l1.clear();
    System.out.println(l1);
}
}