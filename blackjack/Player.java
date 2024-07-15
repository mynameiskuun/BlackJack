package blackjack;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;
    public Card draw() {

        return new Card(" ", 2);
    }

    public void openCards() {

    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
