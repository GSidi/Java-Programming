package JavaEx.Control_Flow;
import java.util.Scanner;

public class ClassAvg_With_Sentinel {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int total = 0 ;
        int gradeCounter = 0;

        System.out.print("Enter grade or type 0 to quit: ");
        int grade = input.nextInt();

        while(grade != 0){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or type -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0 ){
            double average = (double) total/gradeCounter ;
            
            System.out.printf("%nTotal of the %d grades entered in %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);

        }else
            System.out.println("No grades were entered");


    }
    
}
