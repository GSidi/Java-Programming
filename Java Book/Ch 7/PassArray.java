package JavaBook.Κεφ7;
//perasma pinakwn kai memonwmenwn stoixeiwn enos pinaka se methodous

public class PassArray {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};

        System.out.printf("Effects of passing reference to entire array: %n"+"The values of the original array are: %n");

        //emfanizei arxika stoixeia tou pinaka
        for(int value: array){
            System.out.printf("    %d", value);
        }

        modifyArray(array);//pernaei mia anafora se pinaka
        System.out.printf("%n%nThe values of the modified array are: %n");

         //emfanizei tropopoihmena stoixeia tou pinaka
         for(int value: array){
            System.out.printf("    %d", value);
        }

        System.out.printf("%n%nEffects of passing array element value: %n"+"array[3] before modify element: %d%n", array[3]);

        modifyElement(array[3]);

        System.out.printf("arra[3] after modify element: %d%n", array[3]);

    }


        //polaplasiazei kathe stoixeio tou pinaka epi 2
    public static void modifyArray(int array2[]){
        for(int counter = 0 ; counter < array2.length; counter++){
            array2[counter] *= 2;
        }
    }

    //pollaplasizei to orisma epi 2
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }

    
}

