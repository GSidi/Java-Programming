package JavaBook.Κεφ7;

public class GradeBook {
    
    private String courseName;//onoma tou mathimatos pou antiproswpeuei auto to gradebook
    private int[] grades;// pinakas bathmwn spoudastwn

    public GradeBook(String name, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    //methodos orismou tou onomatos tou mathimatos
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //methodos gia anaklhsh tou onomatos tou mathimatos
    public String getCourseName(){
        return courseName;
    }

    //ktelei diafores leitourgeies sta dedomena
    public void processGrades(){
        //emfanizei ton pinaka grades
        outputGrades();

        //kalei thn methodo getAverage wste na upologisei ton meso oro twn bathmwn
        System.out.printf("%nClass average is %.2f%n", getAverage());

        //kalei tis methodous getMinimum kai getMaximum
        System.out.printf("Lowest grade is %d%n Highest grade is %d%n%n", getMinimum(), getMaximum());

        outputBarChart();
    }

    //euresh elaxistou bathmou
    public int getMinimum(){
        int lowGrade = grades[0];//upothetei oti to grades[0] einai o mikroteros bathmos

        //diasxizei ton pinaka twn bathmwn
        for(int grade : grades){
            //an o bathmos einai mikroteros apo to lower grade ton ekxwrei sto lowGrade
            if(grade < lowGrade){
                lowGrade = grade;//neos elaxistos bathmos
            }
        }

        return lowGrade;
    }

    //euresh megistou bathmou
    public int getMaximum(){
        int highGrade = grades[0];//upothetei oti to grades[0] einai o megaluteros bathmos

        //diasxizei ton pinaka twn bathmwn
        for(int grade : grades){
            //an o bathmos einai megaluteros apo to high grade ton ekxwrei sto highGrade
            if(grade > highGrade){
                highGrade = grade;//neos megistos bathmos
            }
        }

        return highGrade;
    }

    //prosdiorismos tou mesou orou twn bathmwn e3etashs
    public double getAverage(){

        int total = 0;
        //athroizei tous bathmous enos spoudasth
        for(int grade: grades){
            total += grade;
        }
        //epistrefei ton meso oro twn bathmwn
        return (double) total/grades.length;
    }

    //emfanizei to rabdogramma me thn katanomh twn bathmwn
    public void outputBarChart(){

        System.out.println("Grade distribution:");

        //apothikeyei thn suxnothta twn bathmwn se kathe perioxh 10 bathmwn
        int[] freq = new int[11];

        //gia kathe bathmo au3anei thn katallhlh suxnothta
        for(int grade : grades){
            ++freq[grade/10];
        }

        //gia kathe suxnothta bathmwn emfanizei thn rabdo se grafhma
        for(int count = 0; count < freq.length; count++){
            //emfanizei thn etiketa rabdou
            if(count == 10){
                System.out.printf("%5d:  ", 100);
            }else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 +9);
            }

            //emfanizei thn rabdo
            for(int i = 0 ; i< freq[count]; i++){
                System.out.print("$");
            }

            System.out.println();
        }
    }

    //emfanish periexomenwn tou pinaka grades
    public void outputGrades(){

        System.out.printf("The grades are : %n%n");

        //emfanizei ton bathmo kathe spoudasth
        for(int student = 0; student< grades.length; student++){
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }
}
