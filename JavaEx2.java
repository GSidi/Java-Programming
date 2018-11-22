
package javaex2;

import java.util.Scanner;
        
public class JavaEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.print("Enter First Integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter Second Integer: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("Sum is %d%n",sum);
    }
    
}
