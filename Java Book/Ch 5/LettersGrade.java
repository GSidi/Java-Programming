package JavaBook.Κεφ5;
import java.util.Scanner;

public class LettersGrade {
    
    public static void main(String[] args) {
        int total = 0;//athroisma bathmwn
        int gradeCounter = 0 ;//plhthos eisagomenwn bathmwn
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;//metrhths bathmwn

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the integer grades in the range  0-100",
        "Type the end-of-file indicator to terminate input:",
        "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter");

        //epanalh4h mexri o xrhsths na eisagei deikth telous tou arxeiou
        while(input.hasNext()){

            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            //au3hsh katallhlou metrhth bathmou grammatos
            switch(grade/10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                
                case 8:
                    ++bCount;
                    break;

                case 7:
                    ++cCount;
                    break;
                
                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;

            }
        }

        //emfanish bathmwn
        System.out.printf("%nGrade Report:%n");

        //an o xrhsths edwse toulaxiston enan bathmo
        if(gradeCounter != 0){
            //upologismos tou mesou orou olwn twn bathmwn
            double average = (double)total/ gradeCounter;

            //emfanizei suno4h apotelesmatwn
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%dn",
            "Number of students who received each grade",
            "A: ",aCount,"B: ",bCount,"C: ",cCount,"D: ",dCount,"F: ",fCount);
        }else
            System.out.println("No grades where entered");

        input.close();
    }

}
