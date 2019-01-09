package ee.taltech.itcolledge.cardgame;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CardgameTest {

    @Test
    public void cards_contain_ace_of_spades() {
        List<Card> cards = Cardgame.newSetOfCards();
        // todo cards must contain
        Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
    }
}