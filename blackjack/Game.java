package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Game {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void start() throws IOException {

        System.out.println("######### BLACK JACK GAME START #########");

        CardDeck cardDeck = new CardDeck();
        User user = new User();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        initialDrawing(dealer, user);
        showCurrentCards(dealer, user);

        while(true) {
            boolean continuable = progress(user, rule);
            showCurrentCards(dealer, user);
            if (!continuable) {
                finalizeGame(dealer, user, rule);
                break;
            }
        }
    }

    private void initialDrawing(Dealer dealer, User user) {
        for(int i=0; i<2; i++) {
            user.hit();
            dealer.hit();
        }
    }

    private boolean progress(User user, Rule rule) throws IOException {
        StringBuilder sb = new StringBuilder();

        boolean flag = true;

        sb.append("다음의 1번과 2번 선택지 중 하나를 선택하세요. \n");
        sb.append("1. hit(카드 뽑기) | 2. stand(게임 중지) \n");
        System.out.println(sb);

        String input = br.readLine();

        if(input.equals("1")) {
            user.hit();
        } else if(input.equals("2")) {
            user.stand();
            flag = false;
        }

        if(rule.isBurst(user)) {
            flag = false;
        }

        return flag;
    }

    private Player finalizeGame(Dealer dealer, User user, Rule rule) {
        if(dealer.calculateCardValue() < 17) {
            dealer.hit();
        }
        Player winner = rule.judgeWinner(dealer, user);
        Class<? extends Player> instance = winner.getClass();

        System.out.println("승자는 : " + instance.getSimpleName() + " 입니다.");
        return winner;
    }

    private void showCurrentCards(Dealer dealer, User user) {
        StringBuilder sb = new StringBuilder();

        LinkedList<Card> dealerCards = dealer.getCards();
        LinkedList<Card> userCards = user.getCards();

        Card dealerFaceUpCard = dealerCards.getFirst();

        sb.append("딜러의 오픈된 카드는 ").append(dealerFaceUpCard.getSymbol()).append(" ").append(dealerFaceUpCard.getRank()).append(" 입니다\n");
        sb.append("유저는 현재 다음의 ").append(userCards.size()).append("장의 카드를 보유중입니다.\n");
        for(Card card : userCards) {
            sb.append(card.getSymbol() + " " + card.getRank() + "\n");
        }
        sb.append("유저의 현재 카드 합산 점수 : " + user.calculateCardValue() + "\n");

        System.out.println(sb);
    }
}
