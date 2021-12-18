package JavaBook.Κεφ7;


public class GradeBook2{

    private String courseName; //onoma tou mathimatos pou antiproswpeuei h bathmologia
    private int[][] grades; //disdiastatos pinakas bathmwn

    public GradeBook2(String courseName, int[][] grades){

        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String name){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    //ektelei diafores leitourgeies ia ta dedomena
    public void processGrades(){
        //emfanizei ton pinaka bathmwn
        outputGrades();

        //kalei tis methodous getMinimum kai get Maximum
        System.out.printf("%n%s %d%n%s %d%n%n",
         "Lowest grade in the grade book is :", getMinimum(),
         "Highest grade int hte grade book is:", getMaximum());

         //emfanizei to grafhma katanomhs olwn twn bathmwn se oles ti e3etaseis
         outputBarChart();
    }

    //euresh elaxistou bathmou
    public int getMinimum(){
        //upothetei oti to prwto stoixeio tou pinaka grades einai to mikrotero
        int lowGrade = grades[0][0];

        //brogxos pou diasxizei tis grammes tou pinaka grades
        for(int[] studentGrades: grades){
            //brogxos pou diasxizei tis steiles ths trexousas grammhs
            for(int grade: studentGrades){
                //an to grade einai mikrotero tou low grade, to ekxwrei sto lowgrade
                if(grade< lowGrade){
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    //euresh tou megistou bathmou
    public int getMaximum(){
        //upothetei oti to prwto stoixeio tou pinaka grades einai to megalutero
        int highGrade = grades[0][0];

        //brogxos pou diasxizei tis grammes tou pinaka grades
        for(int[] studentGrades: grades){
            //brogxos pou diasxizei tis steiles ths trexousas grammhs
            for(int grade: studentGrades){
                //an to grade einai mmegalutero tou high grade, to ekxwrei sto highGrade
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    //prosdiorizei ton meso oro twn bathmwn gia to sugkekrimeno sunolo bathmwn
    public double getAverage(int[] setOfGrades){
        
        int total = 0;
        //athroizei tous bathmous enos spoudasth
        for(int grade: setOfGrades){
            total += grade;
        }
        //epistrefei ton meso oro twn bathmwn
        return(double) total/ setOfGrades.length;
    }

    //emfanizei ena rabdogramma me thn sunolikh katanomh twn bathmwn
    public void outputBarChart(){

        System.out.println("Overall grade distribution:");

        //apothikeuei thn suxnothta twn bathmwn se kateh perioxh 10 bathmwn
        int[] frequency = new int[11];

        //gia kathe bathmo sto GradeBook au3anei thn katallhlh suxnothta
        for(int[] studentGrades:grades){
            for(int grade: studentGrades){
                ++ frequency[grade/10];
            }
        }

        //gia kathe suxnothta bathmwn, emfanizei mia rabdo se grafhma
        for(int count = 0; count < frequency.length; count++){
            
            if(count == 10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%02d-%02d:", count * 10, count * 10 + 9);
            }

            //emfanizei rabdo
            for(int stars = 0; stars< frequency[count]; stars++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //emfanizei ta periexomena tou pinaka grades
    public void outputGrades(){

        System.out.printf("The grades areL %n%n");
        System.out.print("           ");//stoixeizei tis pinakides

        //dhmiourgei mia epikefalida steilhs gia kathe e3etash
        for(int test = 0; test<grades[0].length ; test++){
            System.out.printf("Test %d  ", test + 1);
        }

        System.out.println("Average");// epikefalida sthlhs tou mesou orou twn spoudastwn

        //dhmiourgei grammes/steiles keimenou pou antiproswpeuoun ton pinaka grades
        for(int student = 0; student<grades.length; student++){
            System.out.printf("Student %2d", student + 1);

            for(int test : grades[student]){//emfanizei tous bathmous tou spoudasth
                System.out.printf("%8d", test);
            }

            //kalei thn methodo getAverage wste na upologisei ton meso oro twn bathmwn enos spoudasth
            //perna kathe grammh twn bathmwn ws orisma sthn getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }


}
