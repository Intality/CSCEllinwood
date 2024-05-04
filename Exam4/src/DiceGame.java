import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class DiceGame {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in); PrintWriter output = new PrintWriter("DiceGameOutput.txt")) {
            System.out.print("Enter the number of sides for the die being used: ");
            int numSides = scanner.nextInt();
            System.out.print("Enter the number of players: ");
            int numPlayers = scanner.nextInt();
            scanner.nextLine(); // Creates new line for player names while entering them

            ArrayList<Player> players = new ArrayList<>();
            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Enter the name for player " + (i + 1) + ": ");
                String name = scanner.nextLine();
                players.add(new Player(name, new Die(numSides)));
            }

            for (Player player : players) {
                player.getDie().roll();
                String result = "Player " + player.getName() + " rolled a " + player.getDie().getValue() +
                        " on a " + player.getDie().getNumSides() + " sided die";
                output.println(result);
            }

            int winnerIndex = decideWinner(players);
            if (winnerIndex >= 0) {
                //-1 indicates a tie
                output.println(players.get(winnerIndex).getName() + " won the game");
            } else {
                output.println("It's a tie.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file you are trying to access has joined the witness protection program and cannot be found at this time.");
        }
    }

    private static int decideWinner(ArrayList<Player> players) {
        int maxRoll = 0;
        int index = -1;
        boolean tie = false;

        for (int i = 0; i < players.size(); i++) {
            int roll = players.get(i).getDie().getValue();
            if (roll > maxRoll) {
                maxRoll = roll;
                index = i;
                tie = false;
            } else if (roll == maxRoll && index != -1) {
                tie = true;
            }
        }

        return tie ? -1 : index;
    }
}
