package org.example;
class Animal{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}
public class MethodOverload {
    public static void main(String[] args) {
        Animal a1=new Animal();
       System.out.println( a1.sum(10,20));
        System.out.println(a1.sum(10,20,10));
    }
}
