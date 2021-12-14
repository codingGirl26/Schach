package atos.chessPieces;

import atos.ChessColor;

public abstract class ChessPiece {
    protected ChessColor color;

    public ChessPiece(ChessColor color) {
        this.color = color;
    }

    public ChessColor getColor() {
        return this.color;
    }
}
