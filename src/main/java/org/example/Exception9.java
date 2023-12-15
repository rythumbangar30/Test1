package org.example;
class Test{
    void mssg()throws ArithmeticException{
        System.out.println("Parent class");
    }
}
public class Exception9 extends Test{
    void mssg()throws Exception{
        System.out.println("child class");
    }
    public static void main(String[] args) {
        Test t1=new Exception9();
        t1.msg();
    }
}
