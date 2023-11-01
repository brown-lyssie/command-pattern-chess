import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Player players[] = {new Player(), new Player()};    
    int turnNum = 0;
    int playerNum = 0;
    Scanner myScanner = new Scanner(System.in);
    String userSelection;
    player1.displayPieces();
    player2.displayPieces();
    player1.movePiece(0);
    player2.movePiece(3);
    player1.movePiece(3);

    while (true) {
      System.out.println("Turn number: " + turnNum.toString());
      System.out.println("Player " + playerNum.toString() + "'s turn");
      System.out.print("Select move (0) or display pieces (1): ");
      userSelection = myScanner.nextLine();
      if (userSelection == "0") {
        System.out.print("Select piece (0 through 16) to move: ");
        userSelection = myScanner.nextLine();
        player[playerNum].movePiece(userSelection.toInt());
      }
      else if (userSelection == "1") {
        player[playerNum].displayPieces();
      }
      playerNum++;
      playerNum %= 2; // keeps it between 0 and 1

    }

  }
}