package JavaBook.Κεφ5;

public class Sum {
    
    public static void main(String[] args) {
        int total = 0;

        for(int number = 1; number <=20; number++){
            total += number;
        }

        System.out.printf("Sum is %d%n", total);
    }

}
