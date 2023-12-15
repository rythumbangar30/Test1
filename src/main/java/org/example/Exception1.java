//Defination
//The runtime error is called an exception and the mechnaism that handle
//error at runtime is called Exception Handling mechanism.

//Concepts
//if super class method exception subclass overriden method can declare same
//subclass exception or no exception but cannot declare parent exception
//see Example Exception9

// if super class method didn't declare exception , subclass overriden method
//can't declare checked exception but can declare unchecked exception
//see Example Exception8
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
