package br.tiago.pokerhelper.domain;

// Representa uma carta de baralho (valor + naipe).
// É imutável: depois de criada, não pode ser alterada.
public class Card {

    private final Rank rank;
    private final Suit suit;

    // Toda carta precisa nascer com valor e naipe.
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Define como a carta será exibida ao imprimir no console.
    public String toString() {
        return rank + " of " + suit;
    }
}