package edu.canisius.csc213.project1;

/**
 * Represents a playing card with a suit and rank.
 */
public class Card {

    public enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES }
    public enum Rank { 
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, 
        JACK, QUEEN, KING, ACE 
    }

    // TODO: Define private fields for suit and rank.
    private Suit suitvalue;
    private Rank rankvalue;

    // TODO: Implement the constructor.

    public Card(Suit suit, Rank rank){
        this.suitvalue = suit;
        this.rankvalue = rank;
    }

    // TODO: Implement getters for suit and rank.
    public Suit getSuit() {
        return suitvalue;
    }
    public Rank getRank() {
        return rankvalue;
    }
    

    // TODO: Override toString() to return a readable format.
    public String toString() {
        return rankvalue + " of " + suitvalue;
    }

    // TODO: Override equals() and hashCode() for comparisons.
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card c = (Card) obj;
            if (this.suitvalue == c.getSuit() && this.rankvalue == c.getRank()){
              return true;  
            }
        }
    return false;
    }
    
    public int hashCode() {
        return 0;
    }

}
