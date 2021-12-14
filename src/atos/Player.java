package atos;

public class Player {
    protected ChessColor color;

    public Player(ChessColor color) {
        this.color = color;
    }

    public ChessColor getColor() {
        return color;
    }
}
