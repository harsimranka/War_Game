package ca.sheridancollege.project;

import java.util.Collections;
import java.util.LinkedList;

public class GroupOfCards {
    private LinkedList<Card> cards;

    public GroupOfCards() {
        cards = new LinkedList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card drawCard() {
        return cards.poll();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
