package JavaBook.Κεφ7;
//xrhsh orismatwn grammhs entolwn gia arxikopoihsh enos pinaka

public class InitArray2 {

    public static void main(String[] args) {
        
        //elegxei to plhthos orismatwn ths grammhs entolwn
        if(args.length != 3){
            System.out.printf("ERROR:Ξανα βάλε τα στοιχεία:%n"+"1)Μήκος Πίνακα,2)Αρχική τιμή,3)Βήμα%n");
        }else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            //pairnei thn arxikh timh kai au3anei sumfwna me to orisma ths grammhs entolwn
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            //upologizei thn timh kathe stoixeiou tou pinaka
            for(int counter = 0; counter < array.length; counter++){
                array[counter] = initialValue + increment * counter ;
            }

            System.out.printf("%s%8s%n","Index","Value");

            //emfanizei ton deikth theshs kai thn timh tou pinaka
            for(int counter = 0; counter < array.length; counter ++){
                System.out.printf("%5d%8d%n", counter , array[counter]);
            }
        }
    }
    
}
