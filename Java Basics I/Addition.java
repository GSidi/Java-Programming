package JavaEx.Κεφ2;

import java.util.Scanner;


public class Addition {
    
    //H methodos main 3ekinaei thn ektelesh ths Java efarmoghs
    public static void main(String[] args){

        //dhmiourgei scanner wste na parei thn eisodo apo to parathuro entolwn
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Enter first integer:");
        num1 = input.nextInt();//diabazei ton prwto arithmo apo ton xrhsth

        System.out.print("Enter second integer:");
        num2 = input.nextInt();//diabazei ton deutero arithmo apo ton xrhsth

        sum = num1+num2;

        System.out.printf("Sum is : %d%n", sum);//emfanizei to athroisma

        input.close();


    }
}
