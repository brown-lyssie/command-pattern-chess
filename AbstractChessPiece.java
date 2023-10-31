public abstract class AbstractChessPiece implements ChessCommand{
    protected int row;
    protected char col;
    abstract public void execute();
    abstract public void undo();
    abstract public void displayPiece();
}
