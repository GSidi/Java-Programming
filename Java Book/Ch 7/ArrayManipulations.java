package JavaBook.Κεφ7;
import java.util.Arrays;

public class ArrayManipulations {
    

    public static void main(String[] args) {
        //ta3inomish tou double arrays se au3ousa seira
        double[] doubleArrays = {1.2,33.4,5.4,665.7,87.12,56.6,89.09,123.009};
        Arrays.sort(doubleArrays);
        System.out.printf("%ndoubleArray: ");

        for(double value: doubleArrays){
            System.out.printf("%.1f ", value);
        }

        //gemisma pinaka 10 stoixeiwn me 7
        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 7);
        displayArray(filledArray, "filledArrays: ");//display array

        //antigrafh pinaka me intArray ston pinaka intArrayCopy
        int[] intArray = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray,"intArray: ");
        displayArray(intArrayCopy,"intArrayCopy: ");

        //sugkrish twn intArray kai intArrayCopy gia isothta
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",(b ?  "==" : "!="));

        //anazhthsh ston intArray gia thn timh 5
        int location = Arrays.binarySearch(intArray, 5);

        if(location >= 0){
            System.out.printf("Found 5 at element %d in intArray%n", location);
        }else{
            System.out.println("5 not found in intArray");
        }

        //anazhthsh ston intArray gia thn timh 8765
        location = Arrays.binarySearch(intArray, 8765);

        if(location >= 0){
            System.out.printf("Found 8765 at element %d in intArray%n", location);
        }else{
            System.out.println("8765 not found in intArray");
        }

    }

    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s", description);

        for(int value: array){
            System.out.printf("%d", value);
        }
    }

}
