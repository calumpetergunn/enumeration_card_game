import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void setUp(){
        player = new Player();
        deck = new Deck();
    }

    @Test
    public void canAddPlayingCardToHand(){
        deck.populateDeck();
        deck.shuffleDeck();
        player.addPlayingCardToHand(deck);
        assertEquals(1, player.getHandCount());
    }

}
