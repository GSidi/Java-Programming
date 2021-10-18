package JavaEx.Control_Flow3;
import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
      
        //Simple break example
        /*
        for(int i = 0; i <= 10; i++){

            if(i == 5)
                break;

            System.out.println(i);
        }
    }*/

        //A more coplex break example
        Double number,sum = 0.0;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if(number < 0.0){
                break;
            }

            sum += number;
        }

        System.out.println(("sum is :"+ sum));
    
    }
}
