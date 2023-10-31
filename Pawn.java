public class Pawn extends AbstractChessPiece{
    Pawn(char startingCol) {
        col = startingCol;
    }

    public void execute() {
        row += 1;
        System.out.println("Pawn moves from" + col + (row - 1) + " to " + col + row); 
    }

    public void undo() {
        row -= 1;
        System.out.println("UNDO Pawn moves from" + col + (row + 1) + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Pawn is at " + col + row);
    }

}
