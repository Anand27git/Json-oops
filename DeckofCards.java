package deckcardtest;

import java.util.Random;

/************
 * 
 * @author ANAND
 * Deck card Shuffle
 *
 */
public class DeckofCards {

	private Card deck[]; // array of card objects
	private int currentCard; // index of next card to be deal
	private final int NUMBER_OF_CARDS = 52; // constant number of cards
	private Random randomNumbers; // Random generator

	public DeckofCards() {
		String faces[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jocker", "Queen", "King", };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		deck = new Card[NUMBER_OF_CARDS]; // create array of card object
		currentCard = 0; //
		randomNumbers = new Random();

		// populate deck with card objects
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);

	}

	public void shuffle() {
		// after shuffle deal should start with deck[0] again
		currentCard = 0;
		for (int first = 0; first < deck.length; first++) {
			// select random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			// swap current card with randomly selected card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
}
