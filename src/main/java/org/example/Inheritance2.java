package org.example;
class Cat1{
    void eat(){
        System.out.println("Roti");
    }
}
class Dog1 extends Cat1{
    void bark(){
        System.out.println("Bow-Bow");
    }
}
class Pig extends Cat1{
    void show(){
        System.out.println("Big Pig");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Pig p1=new Pig();
        Dog1 d1=new Dog1();
        d1.bark();
        d1.eat();
        p1.show();
        p1.eat();
    }
}
