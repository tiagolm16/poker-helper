package br.tiago.pokerhelper.service;

import br.tiago.pokerhelper.domain.Action;
import br.tiago.pokerhelper.domain.GameState;

public interface Strategy {
    Action decide(GameState state);

}
