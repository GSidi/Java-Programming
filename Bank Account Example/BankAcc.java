
package javaex4;


public class BankAcc {
    
    private String name;
    private double balance;
    
    //constructor
    public BankAcc(String name, double balance){
        this.name = name;
        
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    //prosthetw ena egguro poso sto upoloipo
    public void deposit (double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}
