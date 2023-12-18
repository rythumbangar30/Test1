package org.example;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name;
    int rollno;
    int age;
    Student(int rollno,int age,String name){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
    }
}
public class ArrayList3 {
    public static void main(String[] args) {
        Student s1=new Student(101,21,"Rahul");
        Student s2=new Student(102,20,"Kali");
        Student s3=new Student(104,23,"Shyam");
        ArrayList<Student> l1=new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        Iterator itr= l1.iterator();
        while (itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
