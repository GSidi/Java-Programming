package JavaEx.Control_Flow;

public class Student{

    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;
        
        if(average>0.0)
            if(average <= 100.0)
                this.average = average;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAverage(double average){
        if(average>0.0)
            if(average <= 100.0)
                this.average = average;

    }

    public double getAverage(){
        return average;
    }

    //returns the students mark with a letter
    public String getLetterGrade(){

        String lettergrade = "";
        if(average >=90.0)
            lettergrade = "A";
        else if (average >= 80.0)
            lettergrade = "B";
        else if (average >= 70.0)
            lettergrade = "C";
        else if (average >=60.0)
            lettergrade = "D";
        else 
            lettergrade = "F";

        return lettergrade;

    }



}