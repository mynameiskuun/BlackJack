package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BlackJackApplication {

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.start();
    }
}
