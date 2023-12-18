package org.example;

import java.io.IOException;

class Test{
    void msg(){
        System.out.println("parent");
    }
}
public class Exception8 extends Test {
    void msg()throws ArithmeticException{
    System.out.println("Child class");
}
    public static void main(String[] args) {



    Test t1=new Exception8();
    t1.msg();
}
}
