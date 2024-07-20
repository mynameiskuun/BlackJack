package blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class CardDeck {

    private static final int NUMBER_OF_CARDS = 52;
    private static final String[] CARDS_NAMES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
    private static final String[] CARDS_SYMBOLS = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
    public static final LinkedList<Card> CARDS = new LinkedList<>();

    public CardDeck() {
        initialize();
    }

    private void initialize() {
        for(int i=0; i<CARDS_NAMES.length; i++) {
            for (String symbols : CARDS_SYMBOLS) {
                Card card = new Card(symbols, CARDS_NAMES[i]);
                this.CARDS.add(card);
            }
        }
        if(CARDS.size() == NUMBER_OF_CARDS) {
            this.shuffle();
        }
    }

    private void shuffle() {

        LinkedList<Card> cards = this.CARDS;
        Collections.shuffle(cards);
    }
}
