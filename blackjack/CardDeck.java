package blackjack;

import java.util.LinkedList;
import java.util.Random;

public class CardDeck {

    public static int NUMBER_OF_CARDS = 52;
    public static int CARDS_PER_SYMBOLS = 13;
    public static String[] CARDS_SYMBOLS = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
    private LinkedList<Card> cards;

    public CardDeck() {
        for(int i=0; i<CARDS_PER_SYMBOLS; i++) {
            for (String symbols : CARDS_SYMBOLS) {
                Card card = new Card(symbols, i);
                this.cards.add(card);
            }
        }
    }
    public LinkedList<CardDeck> shuffle() {

        LinkedList<Card> cards = this.cards;
        Random random = new Random();

        for(int i=0; i<cards.size(); i++) {

        }

        return new LinkedList<>();
    }

    public LinkedList<Card> getCards() {
        return cards;
    }
}
