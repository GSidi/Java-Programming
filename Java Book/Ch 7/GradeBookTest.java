package JavaBook.Κεφ7;

public class GradeBookTest {

    public static void main(String[] args) {

         //pinakas bathmwn stpoudastwn
    int[] gradesArray = { 55,66,43,88,79,89,90,99,100,34,22,16};

    GradeBook myGradeBook = new GradeBook("Mathima mphnelikiwn: Eisagwgh", gradesArray);
    
    System.out.printf("Welcome to the grade book for %n%s%n%n",
        myGradeBook.getCourseName());

    myGradeBook.processGrades();
        
    }
   
    
}
