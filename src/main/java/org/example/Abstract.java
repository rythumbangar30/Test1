package org.example;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){System.out.println("Drawing the Rectangle");};
}
class Circle extends Shape{
    void draw(){System.out.println("Drawing the Circle");};
}

public class Abstract {
    public static void main(String[] args) {
Shape s1= new Rectangle();
s1.draw();
Shape s2=new Circle();
s2.draw();
    }
}
