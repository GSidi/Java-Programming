package JavaEx.Control_Flow;
import java.util.Scanner;

public class GasConsumption {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double kilometers = 0;
        double litres = 0;
        int trip = 0 ;
        double kHperLitre = 0;
        boolean returned = true;
        double total_kH = 0;
        double total_litres = 0;

        System.out.print("Enter the number of your trip or type 0 if you have no more trips: ");
        trip = input.nextInt();

        System.out.print("Enter the total kilometers of your trip: ");
        kilometers = input.nextDouble();

        System.out.print("Enter the total litres consumed during your trip: ");
        litres = input.nextDouble();

        kHperLitre = kilometers / litres ;

        System.out.printf("Number of Trip: %d%nNumber of kilometers: %.2f%nAmount of gas consumed: %.2f%n Kilometers per litre: %.2f%n"
        ,trip,kilometers,litres,kHperLitre);


        while(returned == true){

            System.out.print("Enter the number of your trip or type -1 if you have no more trips: ");
            trip = input.nextInt();
            if(trip == -1){
                returned = false;
                break;
            }

            System.out.print("Enter the total kilometers of your trip: ");
            kilometers = input.nextDouble();

            System.out.print("Enter the total litres consumed during your trip: ");
            litres = input.nextDouble();

            kHperLitre = kilometers / litres ;

            System.out.printf("Number of Trip: %d%nNumber of kilometers: %.2f%nAmount of gas consumed: %.2f%nKilometers per litre: %.2f%n"
            ,trip,kilometers,litres,kHperLitre);

            total_kH = kilometers + kilometers;
            total_litres = litres + litres;

        }

        System.out.printf("Total number of Trips: %d%nTotal Number of kilometers: %.2f%nTotal Amount of gas consumed: %.2f%nKilometers per litre: %.2f%n"
        ,trip,total_kH,total_litres,kHperLitre);

        


    }
    
}
