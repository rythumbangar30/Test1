//Array to List

package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
public class List1 {
    public static void main(String[] args) {


    String[] arr={"shri","Jii","Almond","Troop"};
    System.out.println(Arrays.toString(arr));
//    for(int i=0;i<arr.length;i++) {
//        System.out.print(arr[i]);
//    }
    System.out.println();

    List<String> l1=new ArrayList<String>();
    for(String s:arr){
       l1.add(s);
    }
    System.out.println(l1);

    ListIterator<String> itr=l1.listIterator();
    while(itr.hasNext()){
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
    }
    while(itr.hasPrevious()){
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
    }
}
}