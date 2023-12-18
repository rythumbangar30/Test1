package org.example;

import java.io.IOException;

class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class Exception7 {
    public static void main(String[] args)throws IOException {
        M t1=new M();
        t1.method();
        System.out.println("Run Fine");

    }
}
