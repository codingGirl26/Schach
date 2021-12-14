package atos;

import atos.chessPieces.ChessPiece;

public class Square {
    protected ChessPiece piece;
    protected int row;
    protected int column;

    public Square(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }
}
