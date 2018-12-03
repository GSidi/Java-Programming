
package javaex4;
import java.util.Scanner;


public class JavaEx4 {

   
    public static void main(String[] args) {
      
        BankAcc account1 = new BankAcc("Jane Green", 50.00);
        BankAcc account2 = new BankAcc("John Blue", -7.53);
        
        System.out.printf("%s balance $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance $%.2f%n%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1 : ");
        double depositAmount = input.nextDouble();//pernei thn timh pou dinei o xrhsths
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount);//prosthethei to upoloipo tou account1
        
        //edw emfanizoume ta upoloipa 
        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2 : ");
        depositAmount = input.nextDouble();//pernei thn timh pou dinei o xrhsths
        System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);//prosthethei to upoloipo tou account2
        
        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
        
    }
    
}
