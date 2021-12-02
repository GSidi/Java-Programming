package JavaBook.Κεφ7;

public class InitArray {
    
    public static void main(String[] args) {
        //dhlwnei mia metablhth pinaka kai thn arxikopoiei me ena antikeimeno array 
        int[] array = new int[10];
        int[] array2 = {22,23,231,1324,143,5,43565,467,67,87,5879,789};

        System.out.printf("%s%8s%n", "Index", "Values");

        //emfanizei thn timh kathe stoixeiou 3exwrista
        for(int i = 0; i< array.length; i++){
            System.out.printf("%5d%8d%n", i, array[i]);
        }

        for(int j = 0; j< array2.length; j++){
            System.out.printf("%5d%8d%n", j, array2[j]);
        }
    }
}
