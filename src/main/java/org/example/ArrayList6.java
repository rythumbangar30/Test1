package org.example;
import java.util.*;
public class ArrayList6 {
    public static void main(String[] args) {


ArrayList<String> l1=new ArrayList<>();
l1.add("Ravi");
l1.add("Tej");
l1.add("Cam");
l1.add("era");
ArrayList<String> l2=new ArrayList<>();
l2.add("Ravi");
l2.add("Tej");
//l1.retainAll(l2);

Iterator itr1=l1.iterator();
while(itr1.hasNext()){
    System.out.println(itr1.next());
}
    }
}