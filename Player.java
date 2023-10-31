public class Player {
    private ChessCommand pieces[] = new ChessCommand[16];

    Player(){
        pieces[0] = new Pawn('A');
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
