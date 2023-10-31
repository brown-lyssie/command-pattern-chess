public class Rook extends AbstractChessPiece {

    Rook(char startingCol){
        col = startingCol;
        row = 1;
    }

    public void execute() {
        row += 2;
        System.out.println("Rook moves from" + col + (row - 2) + " to " + col + row); 
    }

    public void undo() {
        row -= 2;
        System.out.println("UNDO Rook moves from" + col + (row + 2) + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Rook is at " + col + row);
    }
}
