package JavaBook.Κεφ7;

public class BarChart {
    
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,6,7,8,9,5,1,12,3,3,4,5,7,4,1};//edw ousiastika exoume to poso wn mathipwn pou phran ton antistoixw bathmo 0 - 200

        System.out.println("Grade Distribution:");

        //gia kathe stoixeio tou pinaka, emfanizetai mia rabdos sto grafhma
        for(int counter = 0 ; counter <array.length ; counter++){
             if(counter == 10){
                 System.out.printf("%5d:  ", 100);
             }else{
                 System.out.printf("%02d-%02d:  ", counter*10, counter*10+9);
             }

             for (int stars = 0 ; stars < array[counter] ; stars++){
                 System.out.print("*");
             }

             System.out.println();
        }
    }

}
