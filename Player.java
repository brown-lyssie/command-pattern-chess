public class Player {
    private ChessCommand pieces[] = new ChessCommand[16];

    Player(){
        pieces[0] = new Pawn('A');
    }
    
    public void displayPieces() {
        for (int i = 0; i < 16; i++) {
            pieces[i].displayPiece();
        }
    }
}
