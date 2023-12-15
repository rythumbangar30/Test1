//The runtime error is called an exception and the mechnaism that handle
//error at runtime is called Exception Handling mechanism.
package org.example;

public class Exception1 {
    public static void main(String[] args) {

    String s1=null;
    int d[]={1,2,3};
    try{
        System.out.println(s1.length());
    }catch(NullPointerException e){
        System.out.println("File some words in an String");
    }
    try{
        System.out.println(d[3]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index of array is invalid");
    }
    System.out.println("Bye");
    }
}
