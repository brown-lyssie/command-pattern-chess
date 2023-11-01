public class Queen extends AbstractChessPiece{
    Queen(){
        col = 'D';
        row = 1;
    }

    public void execute() {
        col += 5;
        System.out.println("Queen moves from" + (col - 5) + row + " to " + col + row); 
    }

    public void undo() {
        col -= 5;
        System.out.println("UNDO Queen moves from" + (col + 5) + row + " to " + col + row);
    }

    public void displayPiece() {
        System.out.println("Queen is at " + col + row);
    }    
}
