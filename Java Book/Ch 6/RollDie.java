package JavaBook.Κεφ6;

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0;//metra ta 1
        int frequency2 = 0;//metra ta 2 ktl
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        //suno4h apotelesmatwn twn 6.000.000 ri3imatwn zariou
        for(int roll = 1; roll<=6000000; roll++){

            int face = 1 + randomNumbers.nextInt(6);//arithmos apo 1 mexri 6

            switch(face){

                case 1:
                    ++frequency1;//au3hsh tou metrith twn 1
                    break;
                case 2:
                    ++frequency2;//au3hsh tou metrith twn 2
                    break;
                case 3:
                    ++frequency3;//au3hsh tou metrith twn 3
                    break;
                case 4:
                    ++frequency4;//au3hsh tou metrith twn 4
                    break;
                case 5:
                    ++frequency5;//au3hsh tou metrith twn 5
                    break;
                case 6:
                    ++frequency6;//au3hsh tou metrith twn 6
                    break;
            }

        }

        System.out.println("Face\tFrequency");//emfanish epikefalidwn
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3
        ,frequency4, frequency5, frequency6);

    }
    
}
