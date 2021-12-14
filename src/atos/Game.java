package atos;

public class Game {
    protected Player whitePlayer = new Player(ChessColor.BLACK);
    protected Player blackPlayer = new Player(ChessColor.WHITE);
    protected Player currentPlayer;
    protected Board board = new Board();

    public Game() {
        this("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w");
    }

    public Game(String fenConfig) {
        this.currentPlayer = this.whitePlayer;

        this.parseFEN(fenConfig);
    }

    protected void parseFEN(String fenConfig) {
        var fenParts = fenConfig.split(" ");

        this.currentPlayer = fenParts[1].equals("w") ? this.whitePlayer : this.blackPlayer;

        this.board.parseFEN(fenParts[0]);
    }

    public void makeTurn(Square source, Square target) {
        if (source.getPiece().getColor() != this.currentPlayer.getColor()) {

        }

        this.currentPlayer = this.currentPlayer == this.whitePlayer ? this.blackPlayer : this.whitePlayer;
    }
}
