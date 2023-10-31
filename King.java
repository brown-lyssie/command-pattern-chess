public class King extends AbstractChessPiece{
    King(){
        col = 'E';
        row = 1;
    }

    public void execute() {
        row += 1;
        System.out.println("Rook moves from" + col + (row - 1) + " to " + col + row); 
    }

    public void undo() {
        row -= 1;
        System.out.println("UNDO Rook moves from" + col + (row + 1) + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Rook is at " + col + row);
    }
}
