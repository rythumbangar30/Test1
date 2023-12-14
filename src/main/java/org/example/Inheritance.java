package org.example;
class salary{
    float f1=40000;
}
public class Inheritance extends salary {
    int bond=100000;
    public static void main(String[] args) {
        Inheritance I1=new Inheritance();
        System.out.println(I1.f1+" and Condition "+I1.bond);
    }
}
