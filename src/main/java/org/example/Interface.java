package org.example;
interface First1{
    void show();
}
interface Second extends First1{
    void display();
}
class Tree implements Second {

    public void show() {
        System.out.println("Print from First");
    }

    public void display() {
        System.out.println("Print from Second");
    }
}
 class Interface{
    public static void main(String[] args) {
        Tree t1=new Tree();
        t1.show();
        t1.display();
    }
}
