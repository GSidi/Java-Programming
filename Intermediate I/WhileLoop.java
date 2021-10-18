package JavaEx.Control_Flow3;
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        

        int x = 1, n = 5;

        while(x<=n){
            System.out.println(x);
            x++;
        }

        //sum of positive numbers only whith while loop
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while(number >= 0){
            sum += number;
            System.out.println("Enter a number: ");
            number = input.nextInt();   
        }

        System.out.println("Sum = " + sum);

        //sum of positive numbers only using do while loop
        int sum1 = 0;
        int number1 = 0;

        do {
        // add only positive numbers
        sum1 += number1;
        System.out.println("Enter a number: ");
        number1 = input.nextInt();
        } while(number1 >= 0); 
        
        System.out.println("Sum = " + sum1);

        input.close();

    }
    
}
