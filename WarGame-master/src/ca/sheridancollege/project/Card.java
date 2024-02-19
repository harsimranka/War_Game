// File: src/ca/sheridancollege/project/Card.java
package ca.sheridancollege.project;

public class Card implements Comparable<Card> {
    private String suit;
    private String rank;
    private int value;

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}