package org.example;
class Cat{
    void bark(){System.out.println("Meow-Meow");}
}
class Dog extends Cat{
    void eat(){System.out.println("Roti");}
}
public class Inheritance1 extends Dog {
    public static void main(String[] args) {
        Inheritance1 I1=new Inheritance1();
        I1.eat();
        I1.bark();
    }
}
