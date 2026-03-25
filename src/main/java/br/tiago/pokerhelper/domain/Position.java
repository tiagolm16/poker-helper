package br.tiago.pokerhelper.domain;

// Representa as posições da mesa (6-max).
// Cada posição possui uma ordem pré-flop e indica se é blind.
public enum Position {

    UTG(0, false),
    MP(1, false),
    CO(2, false),
    BTN(3, false),
    SB(4, true),
    BB(5, true);

    private final int pfOrder;     // Ordem de ação pré-flop (menor age primeiro)
    private final boolean blind;   // Indica se a posição é blind

    Position(int pfOrder, boolean blind) {
        this.pfOrder = pfOrder;
        this.blind = blind;
    }

    public int getPfOrder() {
        return pfOrder;
    }

    public boolean isBlind() {
        return blind;
    }
}