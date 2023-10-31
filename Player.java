public class Player {
    private ChessCommand pieces[] = new ChessCommand[16];

    Player(){
        pieces[0] = new Pawn('A');
        pieces[0] = new Pawn('B');
        pieces[0] = new Pawn('C');
        pieces[0] = new Pawn('D');
        pieces[0] = new Pawn('E');
        pieces[0] = new Pawn('F');
        pieces[0] = new Pawn('G');
        pieces[0] = new Pawn('H');
    }
    
    public void displayPieces() {
        for (int i = 0; i < 1; i++) {
            pieces[i].displayPiece();
        }
    }

    public void movePiece(int pieceIndex) {
        pieces[pieceIndex].execute();
    }
}
