package org.example;

public class Exception6 {
void div(int a,int b)throws ArithmeticException{
    int c;
    if(b==1){
        throw new ArithmeticException("/by one");
    }
    else{
        c=a/b;
        System.out.println(c);
    }
}

    public static void main(String[] args) {
    Exception6 t1=new Exception6();
    try {
//        t1.div(10, 1);
       t1.div(5, 0);
        t1.div(10, 5);
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    }
}
