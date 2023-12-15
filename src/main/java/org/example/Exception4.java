package org.example;

public class Exception4 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the block");
            int a=30/0;
            System.out.println("Arithmetic");
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block exected");
        }
    }
}
