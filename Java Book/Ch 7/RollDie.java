package JavaBook.Κεφ7;
//programma ri3imatos zariwn xrhsimopoiontas pinakes anti gia switch
import java.security.SecureRandom;

public class RollDie{

    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];

        for(int i = 0; i <= 6000000; i++){
            ++frequency[1 + secureRandom.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        //emfanizei kathe timh kathe stoixeiou tou pinaka
        for(int face = 1 ; face < frequency.length; face++){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}