package blackjack;

public class Rule {

    public void gameStart() {

    }
    public boolean hasMoreThan21(Player player) {

        return true;
    }

    public boolean drawOrStopForDealer(Dealer dealer) {
        return true;

    }

    public boolean judgeWinner(Dealer dealer, User user) {
        return true;

    }

    public boolean calculateCardPoints(Dealer dealer, User user) {
        return true;

    }

}
