package JavaEx.Classes_And_Objects;
import java.util.Scanner;

public class AccountTest2 {

    public static void main(String[] args) {
        
        Account2 account1 = new Account2("George Sidiropoulos", 500.00);
        Account2 account2 = new Account2("Mike Karagwgos", -780.00);

        System.out.printf("%s balanceL $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balanceL $%.2f%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit ammount for account1: ");
        double depositAmmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmmount);
        account1.deposit(depositAmmount);// rpsothetei to upoloipo tou account 1

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.print("Enter deposit ammount for account1: ");
        depositAmmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmmount);
        account2.deposit(depositAmmount);// rpsothetei to upoloipo tou account 2

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        input.close();


    }
    
}
