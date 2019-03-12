package deck;
import java.security.SecureRandom;

public class DeckOfCards {
    
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public  DeckOfCards(){
        
        String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
        
        deck = new Card[NUMBER_OF_CARDS];//creates an array of Card objects
        currentCard = 0;
        
        //fills the deck with Cars objects
        for(int count = 0 ; count < deck.length ; count++){
            deck[count] = new Card(faces[count%13],suits[count/13]);
        }
        
        
    }
    
    public void shuffle(){
    
        currentCard = 0;
        
        for(int first = 0 ; first < deck.length ; first++){
            
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            //swapping the current Card with the randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
            
        }
    
    }
    
    public Card dealCard(){
        
           if (currentCard < deck.length){
               return deck[currentCard ++];
           }else{
               return null;
           }
               
    }
    
}
