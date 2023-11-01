public class Player {
    private ChessCommand pieces[] = new ChessCommand[16];

    Player(){
        pieces[0] = new Pawn('A');
        pieces[1] = new Pawn('B');
        pieces[2] = new Pawn('C');
        pieces[3] = new Pawn('D');
        pieces[4] = new Pawn('E');
        pieces[5] = new Pawn('F');
        pieces[6] = new Pawn('G');
        pieces[7] = new Pawn('H');
        pieces[8] = new Rook('A');
        pieces[9] = new Knight('B');
        pieces[10] = new Bishop('C');
        pieces[11] = new King();
        pieces[12] = new Queen();
        pieces[13] = new Bishop('F');
        pieces[14] = new Knight('G');
        pieces[15] = new Rook('H');
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
