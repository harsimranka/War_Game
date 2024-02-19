package ca.sheridancollege.project;

public class Player {
    private String name;
    private GroupOfCards hand;

    public Player(String name) {
        this.name = name;
        hand = new GroupOfCards();
    }

    public void receiveCard(Card card) {
        hand.addCard(card);
    }

    public Card playCard() {
        return hand.drawCard();
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public String getName() {
        return name;
    }
}