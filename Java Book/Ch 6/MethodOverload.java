package JavaBook.Κεφ6;

public class MethodOverload {

    public static void main(String[] args) {//elegxos uperfortomenwn methodwn square
        
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %d%n", square(7.5));
    }

    //methodos square me int orisma
    public static int square(int intValue){
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    //methodos square me double orisma
    public static double square(double doubleValue){
        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }

    
}
