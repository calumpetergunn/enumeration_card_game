import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public ArrayList<PlayingCard> getDeck(){
        return this.deck;
    }


    public int getCount() {
        return this.deck.size();
    }

    public void populateDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                PlayingCard playingCard = new PlayingCard(suit, rank);
                this.deck.add(playingCard);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public PlayingCard dealCard(){
        return this.deck.get(0);
    }

}
