package JavaEx.Κεφ2;

import java.util.Scanner;

public class BMI_Calculation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float weight;
        float height;

        System.out.print("Enter your weight in kilos: ");
        weight = input.nextFloat();

        System.out.print("Enter your height in meters: ");
        height = input.nextFloat();

        float BMI;

        BMI = weight / (height*2);

        System.out.println(BMI);

        if (BMI < 18.5)
            System.out.println("Underweight");
        if (BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Normal");
        if (BMI >= 25 && BMI <= 29.9)
            System.out.println("Overweight");
        if (BMI >= 30)
            System.out.println("Φώντας");
            
        input.close();


    }

}
