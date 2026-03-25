package br.tiago.pokerhelper.app;

import br.tiago.pokerhelper.domain.*;
import br.tiago.pokerhelper.service.DecisionService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.KING, Suit.DIAMONDS);

        List<Card> holeCards = new ArrayList<>();
        holeCards.add(card1);
        holeCards.add(card2);



        List<Card> board = new ArrayList<>();

        GameState state = new GameState(holeCards, board, Position.BB, 1000, 50 );

        DecisionService service = new DecisionService();
        Action action = service.decide(state);
        System.out.println(action);


    }
}
