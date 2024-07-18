package blackjack;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Player {

    Card draw();

    void openCards();

    LinkedList<Card> getCards();
}
