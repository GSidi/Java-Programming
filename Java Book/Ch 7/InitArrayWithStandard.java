package JavaBook.Κεφ7;

public class InitArrayWithStandard {
    
    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10;//dhlwnei mia stathera
        int array[] = new int[ARRAY_LENGTH];

        //upologizei timh ga kathe stoixeio tou pinaka
        for(int counter =0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "Index", "Values");

        for(int j = 0; j< array.length; j++){
            System.out.printf("%5d%8d%n", j, array[j]);
        }
    }
}
