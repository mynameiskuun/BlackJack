package blackjack;

import java.util.LinkedList;

public class Rule {

    public boolean isBurst(Player player) {
        int totalValue = player.calculateCardValue();
        return totalValue > 21;
    }

    public Player judgeWinner(Dealer dealer, User user) {
        StringBuilder sb = new StringBuilder();

        int dealerTotalValue = dealer.calculateCardValue();
        int userTotalValue = user.calculateCardValue();

        if(isBurst(dealer)) {
            System.out.println("Dealer의 총점이 21점을 초과했습니다.");
            return user;
        } else if(isBurst(user)) {
            System.out.println("User의 총점이 21점을 초과했습니다.");
            return dealer;
        }

        Player winner = dealerTotalValue > userTotalValue ? dealer : user;

        sb.append("Dealer 의 합계 점수는 ").append(dealerTotalValue).append(" 입니다. \n");
        sb.append("User 의 합계 점수는 ").append(userTotalValue).append(" 입니다. \n");

        System.out.println(sb);
        return dealerTotalValue > userTotalValue ? dealer : user;
    }

    public isContinuable(User user) {

    }
}
