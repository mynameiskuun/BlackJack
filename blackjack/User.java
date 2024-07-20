package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class User implements Player{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private LinkedList<Card> cards;

    @Override
    public void hit() {
        if (CardDeck.CARDS.isEmpty()) {
            System.out.println("카드가 모두 소진 되었습니다.");
        } else {
            System.out.println("User가 카드를 1장 받습니다.");
            cards.add(CardDeck.CARDS.pop());
        }
    }

    public User() {
        this.cards = new LinkedList<>();
    }

    public void stand() {
        // 카드를 받지 않는다는 신호
        System.out.println("카드를 더이상 받지 않습니다. 점수 계산이 진행됩니다.");
    }

    public LinkedList<Card> getCards() {
        return cards;
    }

    @Override
    public int calculateCardValue() {
        int value = 0;
        for(Card card : this.cards) {
            value += card.getValue();
        }
        return value;
    }
}
