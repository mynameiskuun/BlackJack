package blackjack;

import java.util.LinkedList;

public class Dealer implements Player{

    private LinkedList<Card> cards;

    public Dealer() {
        this.cards = new LinkedList<>();
    }

    @Override
    public void hit() {
        if (CardDeck.CARDS.isEmpty()) {
            System.out.println("카드가 모두 소진 되었습니다.");
        } else {
            System.out.println("Dealer가 카드를 1장 받습니다.");
            cards.add(CardDeck.CARDS.pop());
        }
    }

    @Override
    public int calculateCardValue() {
        int value = 0;
        for(Card card : this.cards) {
            value += card.getValue();
        }
        return value;
    }

    public LinkedList<Card> getCards() {
        return this.cards;
    }

}
