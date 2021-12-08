package JavaBook.Κεφ7;

public class Card {

    private final String face;//figoura filou
    private final String suit;//xrwma

    public Card(String cardFace, String cardSuit){

        this.face = cardFace;//arxikopoiei to filo
        this.suit = cardSuit;//arxikopoiei to xrwma
    }

    //epistrefei to string pou dinei ta stoixeia tou trapouloxarto
    public String toString(){

        return face + " of " + suit;
    }
    
}
