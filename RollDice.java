
package javachapter6;

import java.security.SecureRandom;

        
//ρίξιμο ζαριου 6.000.000 φορές

public class RollDice {

    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom(); 
        
         int freq1 = 0; //μετράει τα 1
         int freq2 = 0; //μετράει τα 2
         int freq3 = 0; //μετράει τα 3
         int freq4 = 0; //μετράει τα 4
         int freq5 = 0; //μετράει τα 5
         int freq6 = 0; //μετράει τα 6
         
         for(int roll = 0 ; roll <= 6000000 ; roll++){ 
             
             int face = 1 + randomNumbers.nextInt(6);// αριθθμοι απο το 1 μέχρι το 6
             
             switch(face){
                 case 1:
                     ++freq1;
                     break;
                 case 2:
                     ++freq2;
                     break;
                 case 3:
                     ++freq3;
                     break;
                 case 4:
                     ++freq4;
                     break;
                 case 5:
                     ++freq5;
                     break;
                 case 6:
                     ++freq6;
                     break; 
                      
             }
             
         }
         
          System.out.println("Face \t Frequency");//εμφάνιση επικεφαλίδων
          System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",freq1,freq2,freq3,freq4,freq5,freq6);
    }
    
}
