package org.example;
class Account{
    private long acc_no;
    private String name,email;
    private float amount ;
    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}
public class Encap {
    public static void main(String[] args) {
        Account acc= new Account();
        acc.setName("Ash");
        acc.setEmail("asgdhfi2@gma.com");
        acc.setAmount(5224168.25f);;
        acc.setAcc_no(254684642);
        System.out.println(acc.getName()+" "+acc.getAcc_no()+" "+acc.getEmail()+" "+acc.getAmount() );
    }
}
