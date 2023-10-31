public interface ChessCommand {
    public void execute();
    public void undo();
    public void displayPiece();
}