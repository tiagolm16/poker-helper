package br.tiago.pokerhelper.domain;

import java.util.List;

public class GameState {

    private final List<Card> holeCards;
    private final List<Card> board;
    private final Position position;
    private final int stack;
    private final int toCall;

    public GameState(List<Card> holeCards,
                     List<Card> board,
                     Position position,
                     int stack,
                     int toCall) {
        if (holeCards == null) {
            throw new IllegalArgumentException("Hole cards não pode ser null");
        }
        if (holeCards.size() != 2) {
            throw new IllegalArgumentException("Texas Hold'em exige 2 cartas na mão");
        }

        if (board == null) {
            throw new IllegalArgumentException("O board não pode ser null");
        }
        if (board.size() > 5) {
            throw new IllegalArgumentException("O board deve ter no máximo 5 cartas");
        }

        this.holeCards = holeCards;
        this.board = board;
        this.position = position;
        this.stack = stack;
        this.toCall = toCall;
    }

    public List<Card> getHoleCards(){
        return holeCards;
    }
    public List<Card> getBoard(){
        return board;
    }
    public Position getPosition(){
        return position;
    }
    public int getStack(){
        return stack;
    }
    public int getToCall(){
        return toCall;
    }




}
