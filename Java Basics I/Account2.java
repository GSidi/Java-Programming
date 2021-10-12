package JavaEx.Classes_And_Objects;

public class Account2 {
    
    private String name;
    private double balance;

    public Account2(String name, double balance){
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
        
    }

    public void deposit(double depositAmmount){

        if(depositAmmount > 0.0)
            balance = balance + depositAmmount;
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
