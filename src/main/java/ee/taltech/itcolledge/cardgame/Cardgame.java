package ee.taltech.itcolledge.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)


        //todo ADVANCED 1
        // what hand do you have?

        //todo ADVANCED 2
        // imagine there are 2 players playing, which one wins

        //todo ADVANCED 3
        // simulate playing blackjack (get 2 cards and ask for more if sum is less than 16)
    }
}
