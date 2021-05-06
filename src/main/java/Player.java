import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> hand;
    private String name;

    public Player(){
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayingCardToHand(Deck deck){
        this.hand.add(deck.dealCard());
    }

    public int getHandCount() {
        return this.hand.size();
    }

    public ArrayList<PlayingCard> getHand() {
        return this.hand;
    }
}
