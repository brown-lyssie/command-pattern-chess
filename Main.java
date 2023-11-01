import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Player players[] = {new Player(), new Player()};    
    int turnNum = 0;
    int playerNum = 0;
    Scanner myScanner = new Scanner(System.in);
    int userSelection;

    while (true) {
      System.out.println("Turn number: " + turnNum);
      System.out.println("Player " + (playerNum + 1) + "'s turn");
      System.out.println("Select move (0) or display pieces (1): ");
      userSelection = myScanner.nextInt();
      if (userSelection == 0) {
        System.out.println("Select piece (0 through 16) to move: ");
        userSelection = myScanner.nextInt();
        players[playerNum].movePiece(userSelection);
        playerNum++;
        playerNum %= 2; // keeps it between 0 and 1
      }
      else if (userSelection == 1) {
        players[playerNum].displayPieces();
        playerNum++;
        playerNum %= 2; // keeps it between 0 and 1
      }
      else {
        System.out.println("Please enter a valid input.");
      }
    }
  }
}