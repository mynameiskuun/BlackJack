package blackjack;

public class Card {

    private String symbol;
    private String rank;
    private int value;

    public Card(String symbol, String rank) {
        this.symbol = symbol;
        this.rank = rank;
        this.value = convertCardValue(rank);
    }

    private int convertCardValue(String rank) {
        int value;
        if(rank.equals("A")) {
            value = 1;
        } else if(rank.equals("K") || rank.equals("Q") || rank.equals("J")) {
            value = 10;
        } else {
            value = Integer.valueOf(rank);
        }
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
}
