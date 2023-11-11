package Practice_Die;

import java.util.Scanner;

/**
 * ChoHan game simulate
 *
 * Dealer class: We will create an instance of this class to represent the dealer. It will have the
 * ability to roll the dice, report the value of the dice, and report whether the total dice value
 * is Cho or Han. Player class: We will create two instances of this class to represent the players.
 * Instances of the class can store the player’s name, make a guess between Cho and Han, and be
 * awarded points.
 *
 * @author huiziqian
 * @version Nov 8, 2023
 *
 */
public class ChoHan {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        String player1Name;
        String player2Name;
        final int MAX_ROUND = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first player' name: ");
        player1Name = input.nextLine();
        System.out.println("Enter the second player' name: ");
        player2Name = input.nextLine();

        Dealer dealer = new Dealer();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        // play the rounds.
        for (int round = 0; round < MAX_ROUND; round++) {
            System.out.println("-------------------------");
            System.out.printf("Now playing round %d.\n", round + 1);

            // roll the dice
            dealer.rollDice();

            // the players make their guesses
            player1.makeGuess();
            player2.makeGuess();

            // determine the winner of this round
            roundResults(dealer, player1, player2);
        }

        // display the grand winner
        displayGrandWinner(player1, player2);

        input.close();
    }

    /**
     *
     * determines the results of the current round.
     *
     * @param dealer the dealer object
     * @param player1 Player #1 object
     * @param player2 player #2 object
     */
    public static void roundResults(Dealer dealer, Player player1, Player player2) {
        System.out.printf("The dealer rolled %d and %d. \n", dealer.getDie1Value(),
            dealer.getDie2Value());
        System.out.printf("Result: %s\n", dealer.getChoOrHan());
        // check each player's guess and award points
        checkGuess(player1, dealer);
        checkGuess(player2, dealer);
    }

    /**
     *
     * checks a player's guess against the dealer's result
     *
     * @param player The player object to check
     * @param dealer the dealer object
     */
    public static void checkGuess(Player player, Dealer dealer) {
        final int POINTS_TO_ADD = 1;
        String guess = player.getGuess();
        String choHanResult = dealer.getChoOrHan();

        System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());
        // award points if the player guessed correctly
        if (guess.equalsIgnoreCase(choHanResult)) {
            player.addPoints(POINTS_TO_ADD);
            System.out.printf("Awarding %d point(s) to %s.\n", POINTS_TO_ADD, player.getName());
        }
    }

    /**
     *
     * displays the games grand winner
     *
     * @param player1
     * @param player2
     */
    public static void displayGrandWinner(Player player1, Player player2) {
        System.out.println("---------------------------");
        System.out.println("Game over. Here are the results:");
        System.out.printf("%s: %d points.\n", player1.getName(), player1.getPoints());
        System.out.printf("%s: %d points.\n", player2.getName(), player2.getPoints());
        if (player1.getPoints() > player2.getPoints()) {
            System.out.println(player1.getName() + "is the grand winner!");
        } else if (player2.getPoints() > player2.getPoints()) {
            System.out.println(player2.getName() + "is the grand winner!");
        } else {
            System.out.println("Both players are tied!");
        }

    }

}
