package ca.sheridancollege.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        WarGame game = new WarGame();

        System.out.println("Welcome to the War Game!");
        System.out.println("Type 'quit' to exit or press Enter to play a round...");

        try {
            while (!game.isGameOver()) {
                System.out.print("Press Enter for next round or type 'quit' to exit: ");
                String input = reader.readLine();

                if ("quit".equalsIgnoreCase(input)) {
                    System.out.println("Exiting game...");
                    break;
                }


                
                // Play a round of the game here.
                // This is where you would have something like game.playRound();
                // And after the round, you can print the status of the game such as who won the round and the card count.

                // Example of playing a round and printing status (you need to implement this according to your game logic):
                game.playRound();
            }
        } catch (IOException e) {
            System.out.println("An input error occurred: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }

        System.out.println("Game over. Thanks for playing!");
    }
}
