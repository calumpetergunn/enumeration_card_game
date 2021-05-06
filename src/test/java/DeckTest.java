import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void canGetDeckCount() {
        assertEquals(0, deck.getCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.getCount());
    }

    @Test
    public void canShuffleDeck() {
        deck.populateDeck();
        deck.shuffleDeck();
        PlayingCard playingCard1 = deck.dealCard();
        deck.shuffleDeck();
        PlayingCard playingCard2 = deck.dealCard();
        assertNotEquals(playingCard1, playingCard2);
    }

}


