import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private HashMap<String, Integer> resultHashmap;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
        this.resultHashmap = new HashMap<>();
    }

    public PlayingCard determineWinner() {
        ArrayList<Integer> playersCardsValues = new ArrayList<>();
        for (Player player : players) {
            int playerCardValue = player.getHand().get(0).getRank().getValue();
            resultHashmap.put(player.getName(), playerCardValue);
        }
        int maxCardValue = Collections.max(resultHashmap.values());
        String winner = resultHashmap.
    }

}
