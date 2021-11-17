import java.util.Scanner;

public class LowestPrice {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean choice;
        int number;
        int start = 0;

        //edw rwtaei ton xrhsth an thelei na suggrinei arithmous
        System.out.println("Do you want to compare numbers?If you want type true: ");
        choice = input.nextBoolean();
        //an thelei tote bazoyme thn epilogh na ginei true 
        if ( choice == true){
            //oso h epilogh tou xrhsth einai na sugrinei tote menoume sthn while
            while(choice == true){

                //zhtaaei apo ton xrhsth na dwsei enan arithmo
                System.out.println("Enter an integer:");
                number = input.nextInt();

                //elegxei an o arithmos einai megalhteros apo thn arxikh bash 
                //meta anathetei ton arithmo tou xrhssth san bash gia na ginei h epomenh suggrish 
                if(number > start){
                    System.out.printf("%d is lower from %d\n",start,number);
                    start = number;

                }else if (start > number){
                    System.out.printf("%d is bigger from %d\n",start,number);
                }


                System.out.println("If you want to stop type false else type true");
                choice = input.nextBoolean();

            }
        }else{
            System.out.println("DONE");
        }

        System.out.println("CIAO");

    }
}
