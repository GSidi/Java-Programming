package JavaBook.Κεφ7;

public class DeckOfCardsTest {

    public static void main(String[] args) {
        
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();//topothethei ta fulla se tuxaia seira

        int i;
        //emfanizei kai ta 52 fulla me thn seira thn opoia moirazontai 
        for(i = 1; i<=52; i++){
            //moirazei kai emfanizei ena fullo
            System.out.printf("%-19s", myDeckOfCards.dealCard());
        }

        if( i % 4 == 0){//emfanizei mia nea grammh kathe 4 fulla
            System.out.println();
        }
    }
    
}
