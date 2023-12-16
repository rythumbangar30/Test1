package org.example;
import java.util.ArrayList;
class Book{
    int id;
    String name,author,publishor;
    int quantity;
    Book(int id,String name,String author,String publishor,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publishor=publishor;
        this.quantity=quantity;
    }
}
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Book> t1=new ArrayList();
        Book b1=new Book(100,"Ram","Brandon","J.K.",100);
        Book b2=new Book(101,"Shyam","George","H.K.",200);
        Book b3=new Book(102,"Kaka","Brad","U.K.",250);
        t1.add(b1);
        t1.add(b2);
        t1.add(b3);
        for(Book b:t1){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publishor+" "+b.quantity);
        }
    }
}
