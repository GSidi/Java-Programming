package JavaBook.Κεφ6;

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {
        
        //to antikeimeno random numbers tha paragei asfaleis tuxaious arithmous
        SecureRandom randomNumbers = new SecureRandom();

        for(int i = 1; i <=20 ; i++){

            //epilogh tuxaious akeraiou apo to 1 ews 6
            int face = 1+ randomNumbers.nextInt(6);

            System.out.printf("%d  ",face);

            if(i % 5 == 0){
                System.out.println();
            }
        }

    }

}