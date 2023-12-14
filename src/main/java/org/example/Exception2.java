package org.example;

public class Exception2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{
            a[10]=30/5;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
    }
}
