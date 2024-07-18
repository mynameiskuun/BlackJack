package blackjack;

import java.util.LinkedList;

public class User implements Player{


    @Override
    public Card draw() {
        LinkedList<Card> cardDeck = CardDeck.cards;

        return null;
    }

    @Override
    public void openCards() {

    }

    @Override
    public LinkedList<Card> getCards() {
        return null;
    }
}
