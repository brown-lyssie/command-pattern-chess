public class Knight extends AbstractChessPiece{
    Knight(char startingCol){
        col = startingCol;
        row = 1;
    }

    public void execute() {
        row += 2;
        col += 1;
        System.out.println("Knight moves from" + (col - 1) + (row - 2) + " to " + col + row); 
    }

    public void undo() {
        row -= 2;
        col -= 1;
        System.out.println("UNDO Knight moves from" + (col + 1) + (row + 2) + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Knight is at " + col + row);
    }    
}
