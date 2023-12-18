package org.example;

public class Exception3 {
    public static void main(String[] args) {
        try{
            try{
                int a=30/0;

            }catch(ArithmeticException e1){
                System.out.println(e1);
            }
            try{
                int a[]=new int[6];
                System.out.println(a[8]);
            }catch(ArrayIndexOutOfBoundsException e2){
                System.out.println(e2);
            }
        }catch(java.lang.Exception e3){
            System.out.println(e3);
        }
    }
}
