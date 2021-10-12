package JavaEx.Classes_And_Objects;
import java.util.Scanner;


public class AccountTest {
    
    public static void main(String[] args) {
        // kwdikas xwris constructor
        Scanner input = new Scanner(System.in);
       /* Scanner input = new Scanner(System.in);

        //neo antikeimeno account
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter a name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is : %n%s%n", myAccount.getName());

        input.close(); */

        //kwdikas mecontructor
        Account account1 = new Account("Xontros Fontas");
        Account account2 = new Account("Starboy 323");

        System.out.printf("account1 name is : %s%n", account1.getName());
        System.out.printf("account2 name is : %s%n", account2.getName());

        input.close();


    }


}
