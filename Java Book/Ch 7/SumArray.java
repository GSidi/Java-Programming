package JavaBook.Κεφ7;

public class SumArray {
    
    public static void main(String[] args) {
        
        int[] array = {1234,123,4,1234,23,4,54,6,657,7,9,95,5,6234,52,45,125,66,734};
        int total = 0;

        //prosthetei thn timh kathe stoixeiou sto sunolo
        for(int counter = 0 ; counter < array.length; counter++){
            total += array[counter];
        }
        
        System.out.printf("Total of array elements: %d%n", total);
    }
}
