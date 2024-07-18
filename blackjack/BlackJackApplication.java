package blackjack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BlackJackApplication {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        rule.gameStart();
        System.out.println("######### BLACK JACK GAME START #########");

        // 카드 섞기
        // 딜러 / 유저 순서로 1장씩 총 2장 card draw
        // 딜러는 2장의 숫자 합이 16점 이하라면 반드시 1장을 추가로 draw 한다. 17점 이상이라면 draw 할 수 없다.
        // 양쪽 모두 추가 뽑기 없이 카드를 오픈하면 딜러와 유저 중 소유한 카드의 합이 21점에 가까운 쪽이 승리한다.
        // 단 21을 초과할 경우, 초과한 쪽이 진다.

        Player dealer = new Dealer();
    }
}
