package br.tiago.pokerhelper.service;

import br.tiago.pokerhelper.domain.Action;
import br.tiago.pokerhelper.domain.GameState;

public class BasicStrategy implements Strategy {
    @Override
    public Action decide(GameState state) {
        if (state.getToCall() == 0) {
            return Action.CHECK;
        } else {
            return Action.CALL;
        }
    }
}
