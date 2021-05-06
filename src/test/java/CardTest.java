import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    PlayingCard card;

    @Before
    public void setUp(){
        card = new PlayingCard(Suit.HEARTS, Rank.EIGHT);
    }


    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetCardRank(){
        assertEquals(Rank.EIGHT, card.getRank());
    }

    @Test
    public void canGetValueOfARank(){
        assertEquals(8, card.getRankValue());
    }
}
