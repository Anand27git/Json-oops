package deckcardtest;

/********
 * 
 * @author ANAND 
 * Deck Cards
 *
 ********/

//card class represents the card playing on the Deck

public class Card {
	private String face; // face of our cards
	private String suit; // suit of our cards

	// creating two argument constructor to initialize cards face and suit
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}

	// return string representation of cards
	public String toString() {
		return face + "of" + suit;
	}
}
