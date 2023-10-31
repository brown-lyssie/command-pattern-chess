public class Bishop extends AbstractChessPiece{
    Bishop(char startingCol){
        col = startingCol;
        row = 1;
    }

    public void execute() {
        row += 3;
        col += 3;
        System.out.println("Bishop moves from" + (col - 3) + (row - 3) + " to " + col + row); 
    }

    public void undo() {
        row -= 3;
        col -= 3;
        System.out.println("UNDO Bishop moves from" + (col + 3) + (row + 3) + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Bishop is at " + col + row);
    }
}
