package edu.canisius.csc213.project1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Represents a deck of playing cards with a configurable size.
 */
public class Deck {
	private final List<Card> cards;

	/**
 	* Creates a deck with a given size.
 	* The size must be a multiple of 4 and at most 52.
 	*
 	* @param size The number of cards in the deck.
 	* @throws IllegalArgumentException if size is invalid.
 	*/
	public Deck(int size) {
    	// TODO: Validate size (must be a multiple of 4 and at most 52).
    	// TODO: Initialize the deck with the correct cards.
		cards = new ArrayList<Card>();
		

		if (size % 4 == 0) {
			if (size == 4) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));		
			}
			else if (size == 8) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));		
			}
			else if (size == 12) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));		
			}
			else if (size == 16) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));		
			}
			else if (size == 20) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));		
			}
			else if (size == 24) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));	
			}
			else if (size == 28) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));	
			}
			else if (size == 32) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));		
			}
			else if (size == 36) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SIX));		
			}
			else if (size == 40) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FIVE));		
			}
			else if (size == 44) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FOUR));		
			}
			else if (size == 48) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.THREE));		
			}
			else if (size == 52) {
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.ACE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.KING));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.KING));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.QUEEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.JACK));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.NINE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.EIGHT));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SEVEN));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.SIX));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FIVE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.FOUR));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.THREE));
				cards.add(new Card(Card.Suit.HEARTS, Card.Rank.TWO));
				cards.add(new Card(Card.Suit.CLUBS, Card.Rank.TWO));
				cards.add(new Card(Card.Suit.DIAMONDS, Card.Rank.TWO));
				cards.add(new Card(Card.Suit.SPADES, Card.Rank.TWO));		
			}
			else if (size == 0) {
				throw new IllegalArgumentException("Error");
			}
		}
		else {
			throw new IllegalArgumentException("Error");
		}



	}

	/**
 	* Shuffles the deck.
 	*/
	public void shuffle() {
    	// TODO: Implement shuffle logic.
		Collections.shuffle(cards);
	}

	/**
 	* Draws the top card from the deck.
 	*
 	* @return The drawn card.
 	* @throws NoSuchElementException if the deck is empty.
 	*/
	public Card draw() {
    	// TODO: Implement draw logic.
		if (cards.isEmpty()) {
			throw new NoSuchElementException("Error");
		}
		return cards.remove(0);
	}

	public void add(Card c){
		cards.add(c);
	}

	/**
 	* Gets the number of remaining cards in the deck.
 	*
 	* @return The number of cards left.
 	*/
	public int size() {
    	// TODO: Implement size method.
    	return cards.size();
	}
}
