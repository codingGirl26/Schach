package atos;

public class Move {
    protected Square source;
    protected Square target;

    public Move(Square source, Square target) {
        this.source = source;
        this.target = target;
    }
}
