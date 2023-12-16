//List to Array
package org.example;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class List2 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("Shyam");
        l1.add("Niyam");
        l1.add("Kam");
        l1.add("Ram");

        String[] arr=l1.toArray(new String[l1.size()]);
        System.out.println(Arrays.toString(arr));
        System.out.println(l1);

    }

}
