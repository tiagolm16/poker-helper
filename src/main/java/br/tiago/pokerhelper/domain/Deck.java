package br.tiago.pokerhelper.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Representa um baralho padrão de 52 cartas.
// Controla criação, embaralhamento e distribuição.
public class Deck {

    private List<Card> cards = new ArrayList<>();

    // Ao criar o baralho, já montamos as 52 combinações possíveis.
    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    // Mostra a quantidade atual de cartas no baralho;
    public int getSize() {
        return cards.size();
    }

    // Embaralha as cartas do baralho.
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Remove e retorna a próxima carta do topo do baralho.
    public Card draw() {
        return cards.remove(0);
    }

    // Distribui uma mão com a quantidade solicitada de cartas.
    // Lança erro se não houver cartas suficientes.
    public List<Card> dealHand(int quantidade) {
        if (quantidade > cards.size()) {
            throw new IllegalStateException("Cartas insuficientes no baralho");
        }

        List<Card> mao = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            mao.add(draw());
        }
        return mao;
    }
}