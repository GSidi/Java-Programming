package JavaEx.Control_Flow;

public class StudentTest {

    public static void main(String[] args) {
        
        Student account1 = new Student("George SIdiropoulos", 93.7);
        Student account2 = new Student("Mark Skordas", 72.56);

        System.out.printf("%s's letter grade is : %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is : %s%n", account2.getName(), account2.getLetterGrade());



    }
    
}
