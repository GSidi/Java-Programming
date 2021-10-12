package JavaEx.Κεφ2;

import java.util.Scanner;

public class Comparison {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first integer:");
        num1 = input.nextInt();

        System.out.print("Enter second Integer");
        num2 = input.nextInt();

        if(num1 == num2){
            System.out.printf("%d == %d%n", num1, num2);
        }
        if (num1 != num2) {
            System.out.printf("%d != %d%n", num1, num2);
        }
        if (num1 < num2){
            System.out.printf("%d < %d%n", num1, num2);
        }
        if (num1 > num2){
            System.out.printf("%d > %d%n", num1, num2);
        }
        if (num1 <= num2){
            System.out.printf("%d <= %d%n", num1, num2);
        }
        if (num1 >= num2){
            System.out.printf("%d >= %d%n", num1, num2);
        }

        input.close();

    }

}
