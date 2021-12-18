package JavaBook.Κεφ7;

public class GradeBook2Test {

    public static void main(String[] args) {
        
        //disdiastatos pinakas bathmwn
        int[][] gradesArray = {{22,34,99},{77,88,90},{05,23,96},{100,45,50},{98,49,56},{29,84,71}};

        GradeBook2 myGradeBook2 = new GradeBook2("Mpinelikia course 2:Advanced", gradesArray);

        System.out.printf("Welcome to the grade book for %n%s%n%n",myGradeBook2.getCourseName());

        myGradeBook2.processGrades();
    }
    
}
