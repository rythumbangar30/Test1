package org.example;
public class Throw {
    public void validate(int age){

            if (age < 18) {
                throw new ArithmeticException("Not Eligible");
            }
            else{
                System.out.println("Eligible for vote");
            }

    }

    public static void main(String[] args) {
     Throw t1=new Throw();
     t1.validate(12);
    }
}
