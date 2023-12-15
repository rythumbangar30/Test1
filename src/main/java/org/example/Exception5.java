package org.example;
class TestException extends Exception
{
    String message;
    public TestException(String str){
        message=str;
    }
    public String toString(){
        return("TestException :"+message);
    }
}
public class Exception5 {
    public static void main(String[] args) {
        int a=10,b=1,c;
        try{
            if(b==1){
                throw new TestException("/by one");
            }
            else{
                c=a/b;
                System.out.println(c);
            }
        }catch(TestException e){
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
