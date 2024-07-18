package blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class CardDeck {

    public static final int NUMBER_OF_CARDS = 52;
    public static final int CARDS_PER_SYMBOLS = 13;
    public static final String[] CARDS_SYMBOLS = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
    public static LinkedList<Card> cards;

    public Card drawCard() {
        return cards.getFirst();
    }

    public void initialize() {
        this.cards = new LinkedList<>();

        for(int i=1; i<=CARDS_PER_SYMBOLS; i++) {
            for (String symbols : CARDS_SYMBOLS) {
                Card card = new Card(symbols, i);
                this.cards.add(card);
            }
        }
        shuffle();
    }
    public LinkedList<Card> shuffle() {

        LinkedList<Card> cards = this.cards;
        Collections.shuffle(cards);
        return cards;
    }

    public LinkedList<Card> getCards() {
        return cards;
    }
}
