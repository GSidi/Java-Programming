package JavaBook.Κεφ7;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card[] deck;//pinakas antikeimenwn card
    private int currentCard;//deikths epomenhs kartas gia moirasma
    private static final int NUMBER_OF_CARDS = 52;// stathero plhtos card

    //gennhtria tuxaiwn arithmwn
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards(){

        String[] faces = {"Ace", "Deuce", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Quenn","King"};

        String[] suits = {"Hearts","Diamons","Spades","Clubs"};

        deck = new Card[NUMBER_OF_CARDS];//dhmiourgei ton pinaka twn antikeimenwn card
        currentCard = 0; // to prwto card pou moirazei ein to deck[0]

        //gemizei thn trapoula deck of cards me atnikeimena cards
        for(int count = 0 ; count < deck.length; count++){
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }

    }

        //anakatema trapoulas me algorithmo enos perasmatos
    public void shuffle(){

            //meta, h klhsh sth methodo deal card tha prepei na jekineisei kai pali apo to deck[0]
            currentCard = 0;

            //gia kathe Card, epilegei ena allo tuxaio card 0 -51 kai ta enallasei
            for(int first = 0 ; first < deck.length; first++){
                // epilegei enan tuxaio arithmo meta3u 0 kai 51
                int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

                //enallasei thn trexousa card me thn tuxaia epilegmenh card
                //ousiastika kanei enallagh timwn anamesa se a,b me xrhsh mias triths metablhths
                Card temp = deck[first];
                deck[first] = deck[second];
                deck[second] = temp;
            }
        }

    public Card dealCard(){

        //prosdiorizei an ta cards pou apemeinan tha moirastoun
        if(currentCard < deck.length){
            return deck[currentCard++];//epistrefei to trexon card ston pinaka
        }else{
            return null;//epistrefei null gia na dei3ei oti moirasthkan olata cards
        }
    }

    
}
