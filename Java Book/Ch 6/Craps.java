package JavaBook.Κεφ6;

import java.security.SecureRandom;

public class Craps {

        
        ////paragei tuxaious arithmous gia xrhsh ths methodou rolldie
        private static final SecureRandom randomNumbers = new SecureRandom();
        //tupos enum me statheres pou antiproswpeuoun thn katastash tou paixnidiou
        private enum Status {CONTINUE, WON, LOST};

        //statheres pou antiproswpeuoun sunhthismena ri3imata zariwn
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;
        
        //paizei to paixnidi
        public static void main(String[] args) {
            
            int myPoint = 0;//bathmos an den upar3ei nikh h hta
            Status gameStatus;//mporei na periexei won continue h lost

            int sumOfDice = rollDice();//prwto ri3hmo twn zariwn 

            //prosdiorizei thn katastash tou paixnidiou kai ton bathmo me bash to prwto ri3hmo
            switch(sumOfDice){

                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            //efoson den exei oloklhrwthei to paixnidi
            while(gameStatus == Status.CONTINUE){

                sumOfDice = rollDice();//ri3imo zariwn kai pali

                //prosdiorizei thn katastash tou paixnidiou
                if(sumOfDice == myPoint){//nikh me bathmo
                    gameStatus = Status.WON;
                }else
                    if (sumOfDice == SEVEN){
                        gameStatus = Status.LOST;
                }
                //emfanish mhnumatos nikhs h htas
                if(gameStatus == Status.WON){
                    System.out.println("Player wins");
                }else{
                    System.out.println("Player lost");
                }

            }

        }

        public static int rollDice(){

            //epilogh tuxaiwn timwn zariwn
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);

            int sum = die1 + die2 ;

            System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

            return sum;

        }
    
    
}
