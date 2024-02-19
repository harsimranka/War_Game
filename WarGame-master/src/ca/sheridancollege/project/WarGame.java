package ca.sheridancollege.project;


public class WarGame extends Game {
    private Player player1;
    private Player player2;
    private GroupOfCards deck;
    private boolean gameOver = false;

    public WarGame() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        deck = new GroupOfCards();
        // ... initialize and shuffle deck, then deal cards ...
    }

    public void playRound() {
        if (!player1.hasCards() || !player2.hasCards()) {
            gameOver = true;
            return;
        }
    
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();
    
        if (card1 == null || card2 == null) {
            // Handle the case when a player has no cards left
            gameOver = true;
            return;
        }
    
        System.out.println(player1.getName() + " plays " + card1);
        System.out.println(player2.getName() + " plays " + card2);
    
        if (card1.compareTo(card2) > 0) {
            System.out.println(player1.getName() + " wins the round.");
            player1.receiveCard(card1);
            player1.receiveCard(card2);
        } else if (card1.compareTo(card2) < 0) {
            System.out.println(player2.getName() + " wins the round.");
            player2.receiveCard(card1);
            player2.receiveCard(card2);
        } else {
            System.out.println("It's a tie. Both cards are set aside.");
            // Handle tie by setting cards aside or implementing 'war' logic
        }
    
        if (!player1.hasCards() || !player2.hasCards()) {
            gameOver = true;
        }
    }
    

    public boolean isGameOver() {
        return gameOver;
    }

    @Override
    public void play() {
        // The play logic is handled round by round in playRound()
    }

    @Override
    public void declareWinner() {
        if (!player1.hasCards()) {
            System.out.println(player2.getName() + " wins the game!");
        } else if (!player2.hasCards()) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw.");
        }
    }
}